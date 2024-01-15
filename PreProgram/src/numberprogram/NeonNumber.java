package numberprogram;

public class NeonNumber {

	public static void main(String[] args) {

		int n = 8;
		int sqr = n * n;
		int rem;
		int sum = 0;
		while (sqr != 0) {
			rem = sqr % 10;
			sum = sum + rem;
			sqr = sqr / 10;
		}


		if (sum == n) {
			System.out.println("Neon number");
		} else {
			System.out.println("Not Neon No");
		}

	}

}
