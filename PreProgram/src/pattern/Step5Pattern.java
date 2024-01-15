package pattern;

public class Step5Pattern {
	public static void main(String[] args) {
		int n = 4;
		System.out.println("----------------Diamond-------");
		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j >= n + 1 && i - j <= n - 1 && j - i <= n-1 && i + j < n*3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("---------------Butterfly-------");
		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				 //if (i+j<=8&& i>=j || i+j <=14 && i+j >=8 && j-i >=0) {
					// if (i+j<=8&& i>=j ||  i+j >=8 && j-i >=0) {
				if ((i + j <= n*2 && i >= j) || (i + j >= n*2 && j >= i)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
