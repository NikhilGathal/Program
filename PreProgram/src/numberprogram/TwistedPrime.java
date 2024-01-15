package numberprogram;

public class TwistedPrime {

	public static void main(String[] args) {

		int n = 23;
		int rem;
		int rev = 0;
		int count = 0;
		System.out.println("Given No " + n );
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			// System.out.println("Prime");
			while (n != 0) {
				rem = n % 10;
				rev = 10 * rev + rem;
				n = n / 10;
			}
			int count1 = 0;
			for (int i = 1; i <= rev; i++) {

				if (rev % i == 0) {
					count1++;
				}
			}
			if (count1 == 2) {
				System.out.println("Twisted Prime no " + rev);
			} else {
				System.out.println("Not Twisted Prime " + rev);
			}

		} else {
			System.out.println("Not prime");
		}
	}

}
