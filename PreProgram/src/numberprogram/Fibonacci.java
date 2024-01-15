package numberprogram;

public class Fibonacci {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int a = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(n1);
			a = n1 + n2;
			n1 = n2;
			n2 = a;
		}

	}

}
