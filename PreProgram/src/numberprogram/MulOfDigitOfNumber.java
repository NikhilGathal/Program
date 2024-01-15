package numberprogram;

public class MulOfDigitOfNumber {

	public static void main(String[] args) {

		int n = 6294;
		int pdt = 1;
		while (n != 0) {
			int rem = n % 10;
			pdt = pdt * rem;

			n = n / 10;
		}
		System.out.println("Mul of Digits is " + pdt);

	}

}
