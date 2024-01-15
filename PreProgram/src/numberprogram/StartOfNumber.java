package numberprogram;

public class StartOfNumber {

	public static void main(String[] args) {
		int n = 5294;
		while (n > 10) {
			n = n / 10;
		}
		if (n % 2 == 0) {
			System.out.println("Num starts with even number ");
		} else {
			System.out.println("Num starts with odd number ");
		}

	}

}
