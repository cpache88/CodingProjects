
import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String describe() {
		StringBuilder builder = new StringBuilder();
		builder
		.append(Player.class.getSimpleName())
		.append(" [name=").append(name)
		.append(", score=").append(score);
		
		for(Card card : hand) {
			builder.append("\n").append(card.describe());
		}
		
		builder.append("]");
		return builder.toString();
	}
	 
	 public Card flip() {
         return hand.remove(0);
     }
	 
	 public void draw(Deck deck) {
		 hand.add(deck.draw());
     }
	 
	 public void incrementScore() {
         score++;
     }
	 
	 public int getScore() {
         return score;
     }
	 
}