import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	 private List<Card> cards = new ArrayList<>();
	 
	 
	 private static final String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
	 
	 private static final String[] names = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
	 
	 
	 public Deck() {
		 for(String suit : suits) {
			 for(int index = 0; index < names.length; index++) {
				 String name = names[index];
				 String cardName = name + " of " + suit;
				 int cardValue = index + 2;
				 
				 Card card = new Card(cardName, cardValue);
				 cards.add(card);
			 }
		 }
	 }

	 public void shuffle() {
		 Random random = new Random();
		 List<Card> temp = new ArrayList<>();
		 
		 while(cards.size() > 0) {
			 int size = cards.size();
			 int position = random.nextInt(cards.size());
			 Card card = cards.remove(position);
			 temp.add(card);
		 }
		 
		 cards = temp;
	 }

	 public Card draw() {
		 return cards.remove(0);
	 }
	 
}