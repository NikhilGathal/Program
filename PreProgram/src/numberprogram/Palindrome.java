package numberprogram;

public class Palindrome {

	public static void main(String[] args) {

		int rem;
		int rev = 0;
		int n = 121;
		int temp = n;
		while (n != 0) {
			rem = n % 10;
			rev = 10 * rev + rem;
			n = n / 10;

		}
		if (temp == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
