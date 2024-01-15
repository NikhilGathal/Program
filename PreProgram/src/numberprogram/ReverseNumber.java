package numberprogram;

public class ReverseNumber {

	public static void main(String[] args) {

		int rem;
		int rev = 0;
		int n = 10012;
		while (n != 0) {
			rem = n % 10;
			rev = 10 * rev + rem;
			n = n / 10;

		}
		System.out.println(rev);

	}

}
