package pattern;

public class Step3Pattern {

	public static void main(String[] args) {

		int n = 4;
		System.out.println("----------------Left-Upper-triangle--------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i >= j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------right-Upper-triangle--------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j >= n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------left-Down-triangle--------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j <= n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------rihgt-Down-triangle--------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------combine-left-right-Upper--------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j <= n + 1 || j - i >= n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("----------------combine-left-right-Down--------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i>=j || i + j >= 2*n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
