
public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Week 2 Assignment - Part 1");
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 5);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("Hello".charAt(0)== 'h');
		System.out.println('\n');
		
		boolean isHotoutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		System.out.println("Week 2 Assignment - Part 2");
		System.out.println(isHotoutside);
		System.out.println(isWeekday);
		System.out.println(hasMoneyInPocket);
		System.out.println('\n');
		
		double costOfMilk = 2.99;
		double moneyInWallet = 100.00;
		int thirstLevel = 10;
		
		System.out.println("Week 2 Assignment - Part 3");
		
		boolean shouldBuyIcecream = true;
				if (isHotoutside == true && hasMoneyInPocket == true) {
					System.out.println(shouldBuyIcecream + ", " + "I should buy some Ice Cream!");
				}  else {
					System.out.println("I should not buy Ice Cream!");
		}
		boolean willGoSwimming = true;
				if (isHotoutside == false && isWeekday == false) {
					System.out.println(willGoSwimming + ", " + "I will go swimming!");
				}  else {
					System.out.println("false, I will not go swimming!");
		}
		boolean isAGoodDay = true;
				if (isHotoutside == true && hasMoneyInPocket == true && isWeekday == false) {
					System.out.println(isAGoodDay + ", " + "I am having a good day!");
				}  else {
					System.out.println("I am not having a good day!");
		}
		boolean willBuyMilk  = true;
		double milk = 50;
		
				if (isHotoutside == true && thirstLevel >= 3 && moneyInWallet >= milk * 2) {
					System.out.println(willBuyMilk + ", " + "I will buy milk!");
				}  else {
					System.out.println("I will not buy milk!");
		}
	}
	
}