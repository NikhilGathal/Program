package numberprogram;

public class MulOfFactorOfNumber {

	public static void main(String[] args) {

		int n = 6;
		int mul = 1;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				mul = mul * i;

			}
		}
		System.out.println("Mul of Factors is " + mul);

	}

}
