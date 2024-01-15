package numberprogram;

public class Xylem {

	public static void main(String[] args) {

		int n = 5678;
		int last = n % 10;
		n = n / 10;
		int isum = 0;
		int osum = 0;

		while (n > 10) {
			int rem = n % 10;
			isum = isum + rem;
			n = n / 10;
		}

		osum = last + n;

		if (isum == osum) {
			System.out.println("Xylem no");
		} else {
			System.out.println("Phloem");
		}

	}

}
