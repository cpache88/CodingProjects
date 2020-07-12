public class App {

	public static void main(String[] args) {

	        Deck deck = new Deck();
	        Player Cesar = new Player("Cesar Pacheco");
	        Player Khris = new Player("Khris Pacheco");

	        deck.shuffle();
	        
	        for (int index = 0; index < 52; index++ ) {
	            if (index % 2 == 0) {
	            	Cesar.draw(deck);
	            } 
	            else {
	            	Khris.draw(deck);
	            }
	        }
	        
	        for (int index = 0; index < 26; index++ ) {
	        
	        Card cesarCard = Cesar.flip();
	        Card khrisCard = Khris.flip();

	        if (cesarCard.getValue() > khrisCard.getValue()) {
	        	Cesar.incrementScore();
	        }
	        else if (khrisCard.getValue() > cesarCard.getValue()) {
	        	Khris.incrementScore();
	        }
	        else {
	        	Cesar.incrementScore();
	        	Khris.incrementScore();
	        }
	        
	        if(Cesar.getScore() > Khris.getScore()) {
	        	System.out.println("Cesar is the winner with a score of: " + Cesar.getScore());
	        }
	        
	        else if(Khris.getScore() > Cesar.getScore()) {
	        	System.out.println("Khris is the winner with a score of: " + Khris.getScore());
	        }
	        
	        else { 
	        	System.out.println("This game has been declared a tie, with a score of " + Cesar.getScore());
	        }
	        }
	}
}
               