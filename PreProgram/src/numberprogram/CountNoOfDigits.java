package numberprogram;

public class CountNoOfDigits {

	public static void main(String[] args) {

		int n = 6294;
		int i = 0;
		while (n > 0) {
			i++;
			n = n / 10;
		}
		System.out.println("no of digit in num is " + i);

	}

}
