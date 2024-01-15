package pattern;

public class Step4Pattern {

	public static void main(String[] args) {
		int n = 4;
		System.out.println("----------------combine-4-Triangle--------");
		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j <= n + 1 || i + j >= (n * 3) - 1 || i - j >= n - 1 || j - i >= n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------hallow-diamond--------");
		for (int i = 1; i <= (3 * n) + 1; i++) {
			for (int j = 1; j <= (3 * n) + 1; j++) {
				if (i + j == n * 2 || j - i == n + 2 || i - j == (n + 2) || i + j == (n * 5)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------hallow-diamond--------");
		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j == n + 1 || i + j == (n * 3) - 1 || i - j == n - 1 || j - i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------Pyramid-Triangle--------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------Pyramid-Down--------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j <= 2 * n && i <= j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------Pyramid-Rotate-to-right------");
		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j <= 2 * n && i >= j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------Pyramid-Rotate-to-left------");
		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j >= 1 + n && i - j <= n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
