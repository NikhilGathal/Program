package numberprogram;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {

		int n = 6294;
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;

			n = n / 10;
		}
		System.out.println("Sum of Digits is " + sum);

	}

}
