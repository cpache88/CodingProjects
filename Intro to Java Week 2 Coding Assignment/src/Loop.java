
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 2;
		int i = 0;
		System.out.print("While loop of even numbers: ");

		while (i <= 50) {
			System.out.print(i * sum + ",");
			i++;
		}

		System.out.println('\n');
		System.out.print("While loop of backward numbers by 3: ");

		int x = 100;

		while (x >= 0) {
			System.out.print(x + ", ");
			x -= 3;
		}

		System.out.println('\n');
		int n = 100;
		System.out.print("Every other number from 1 to 100 printed: ");
		for (int q = 1; q <= n; q++) {
			if (q % 2 != 0) {
				System.out.print(q + ", ");
			}
		}
		System.out.println('\n');
		System.out.println("Every number divisible by 3/5: ");
		for (int i1 = 0; i1 <= 100; i1 += 1) {

			if (i1 % 3 == 0 && i1 % 5 == 0) {
				System.out.println("Hello World");
			}

			else if (i1 % 3 == 0) {
				System.out.println("Hello");

			} else if (i1 % 5 == 0) {
				System.out.println("World");

			} else {
				System.out.println(i1);
			}
		}
	}

}
