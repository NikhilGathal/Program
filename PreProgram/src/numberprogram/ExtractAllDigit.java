package numberprogram;

public class ExtractAllDigit {

	public static void main(String[] args) {

		int n = 6294;
		int rem;
		while (n != 0) {
			rem = n % 10;
			System.out.println(rem);
			n = n / 10;
		}

	}

}
