package numberprogram;

public class StrongNumber {

	public static void main(String[] args) {

		int n = 145;
		int temp = n;
		int count = 0;
		int rem;
		int sum = 0;
		while (n != 0) {
			rem = n % 10;
			int fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			System.out.println(rem + "->" + fact);
			sum = sum + fact;
			n = n / 10;
		}
		System.out.println(sum);

		if (sum == temp) {
			System.out.println("strong number");
		} else {
			System.out.println("Not strong number");
		}

	}
}
