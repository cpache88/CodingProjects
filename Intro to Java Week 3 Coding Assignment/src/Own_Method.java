import java.util.Scanner;

public class Own_Method {

	public static void main(String[] args) {
		
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
