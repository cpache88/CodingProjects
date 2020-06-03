
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable declaration - addition, subtraction, concatenation
		double itemPrice = 35.50;
		double amountofmoneyinwallet = 500.00;
		int numberoffriends = 93;
		int age = 31;
		String firstName = "Cesar";
		String  lastName = "Pacheco";
		char middleInitial = 'A';
		
		double newamountofmoneyinwallet = amountofmoneyinwallet - itemPrice;
		System.out.println(newamountofmoneyinwallet);
		
		int friendsmade = numberoffriends / age;
		System.out.println(friendsmade);
		
		String fullName = firstName + " " + middleInitial + " " + lastName; 
		System.out.println(fullName);
	}

}
