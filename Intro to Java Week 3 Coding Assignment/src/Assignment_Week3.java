import java.util.Scanner;

public class Assignment_Week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 103 };

		int first = ages[0];
		int last = ages[8];

		if (first < last) {
			System.out.println(last - first);
			if (first > last) {
				System.out.println(first - last);
			}
		}
		int average = 0;
		for (int age : ages) {
			average += age;
		}
		System.out.print("Average Age: ");
		average = average / ages.length;
		System.out.println(average);

		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";

		int averageLetters = 0;
		for (String name : names) {
			averageLetters += name.length();
		}
		System.out.print("Average letters in all names: ");
		System.out.println(averageLetters / names.length);

		String allNames = names[0] + ", " + names[1] + ", " + names[2] + ", " + names[3] + ", " + names[4] + ", "
				+ names[5];
		System.out.println("List of all names:" + " " + allNames);

		System.out.print("Name lengths: ");
		for (String name : names) {
			average = average / names.length;
			System.out.print(name + ": ");
			System.out.print(name.length() + " letters, ");
		}

		System.out.print("\n" + "Concatenated names: ");
		for (String name : names) {
			System.out.print(name + " ");
		}

		int nameLengths = 0;
		for (String name : names) {
			nameLengths += name.length();
			System.out.println("\n");
			System.out.print(name + " name length " + name.length());
		}
		
		System.out.println("\n");
		concatenateWord("Hello", 5);
		
		String firstName = "Cesar";
		String lastName = "Pacheco";
		String fullName = fullName(firstName, lastName);
		
		System.out.print("\n");
		System.out.println(fullName);
		
		int[] numberSum = new int[3];
			numberSum[0] = 50;
			numberSum[1] = 60;
			numberSum[2] = 5;
			
			System.out.print("\n");
			int sum = numberSum(numberSum);
			System.out.println(sum);

		
		Double[] people = new Double[2];
		people[0] = 25.50;
		people[1] = 20.50;
		
		System.out.println("\n");
		calcAverage(average);
		System.out.println("The average is: " + average);
		
		System.out.println("\n");
		double moneyInPocket = 10.50;
		willBuyDrink(moneyInPocket, false);
		System.out.println(true);}
	
		void ownMethod(char[] ownMethod) {
			System.out.print(ownMethod);
		}
		int count_Vowels(int count) {
			return count;
		}
	
	private static void calcAverage(int average) {
		// TODO Auto-generated method stub
		
	}

	public static String concatenateWord (String word, int n) {
		String results = ""; 
		for(int i=1;i<=n;i++){
			results = results.concat(word);
		} 
		System.out.println(results);
		return (results);
	}
	
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
				return (fullName);
	}
	
	public static int numberSum (int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}	
			
			if (sum >= 100) {
				System.out.print("True, the amount is: ");
			}
		return sum;
	}
	
	public static double calcAverage(double[]people) {
		  double sum = 0;
		  for (int i = 0; i < people.length; i++)
		  {
		       sum = people[i];
		  }
		  double average = sum / (double)people.length;
		  return average;
		}
	
	public static boolean willBuyDrink(double moneyInPocket, boolean isHotOutside) {
	    if (moneyInPocket >= 10.50 && isHotOutside == true) {
	      return true;
	    } else {
	      return false;
	   }
	}
	
	public static void ownMethod(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("Input word for vowel countage: ");
        String str = in.nextLine();

        System.out.print("This word has the following number of vowels: " + count_Vowels(str)+"\n");
    }
 public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
	}
}
