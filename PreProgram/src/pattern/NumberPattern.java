package pattern;

public class NumberPattern {

	public static void main(String[] args) {

		int n = 4;
		for (int i = 1; i <= n; i++) {
			int num = 1;
			int n2 = i;
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i >= j && i + j != 2 * n) {
					System.out.print(num + " ");
					num++;

				} else if (i + j >= 2 * n) {
					System.out.print(n2 + " ");
					n2--;

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------Diamond-------");

		for (int i = 1; i <= (2 * n) - 1; i++) {
			int num = i;
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j >= n + 1 && i - j <= n - 1 && j - i <= n - 1 && i + j < n * 3) {
					System.out.print(num + " ");
				} else {
					System.out.print("  ");
				}
			}
			num++;
			System.out.println();
		}

		System.out.println("----------------hallow-diamond--------");
		int num1 = 1;
		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j == n + 1 || i + j == (n * 3) - 1 || i - j == n - 1 || j - i == n - 1) {
					System.out.print(num1 + " ");
				} else {
					System.out.print("  ");
				}
			}
			num1++;
			System.out.println();
		}

		System.out.println("----------------Pyramid-Rotate-to-right------");

		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j <= 2 * n && i >= j) {
					System.out.print(j + " ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}

		System.out.println("----------------Square------");

		for (int i = 1; i <= 4; i++) {
			int num4 = i;
			for (int j = 1; j <= n; j++) {
				System.out.print(num4 + " ");
				num4 = num4 + 4;
			}
			System.out.println();
		}

		System.out.println("---------------Diff-square--Number------");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				if ((i + j) % 2 != 0 && j - i <= n - 1 && i + j >= n + 1) {
					System.out.print(i + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("---------------Diff-square---*--");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1 && (i + j) % 2 != 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("-------------Swastik-------");

		for (int i = 1; i <= (2 * n) - 1; i++) {

			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (j == 4 || i == 4 || (i == 1 && j <= n) || (j == 1 && i >= n) || (j == 7 && i <= n)
						|| (i == 7 && j >= 4)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("-----upper---Diamond--NO----");
		int num6 = 1;
		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j >= n + 1 && i - j <= n - 1 && j - i <= n - 1 && i + j < n * 3) {
					System.out.print(num6 + " ");
				} else {
					System.out.print("  ");
				}
			}
			if (i < 4)
				num6++;
			else
				num6--;

			System.out.println();
		}

		System.out.println("-------upper----Triangle-------");
		for (int i = 1; i <= n; i++) {
			int num7 = i;
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1) {
					System.out.print(num7 + " ");
					if (j < n)
						num7--;
					else
						num7++;
				} else {

					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------Diamond-------");
		char ch = 'A';
		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j >= n + 1 && i - j <= n - 1 && j - i <= n - 1 && i + j < n * 3) {

					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}
			if (i < 4)
				ch++;
			else
				ch--;

			System.out.println();

		}

		System.out.println("-----------Diamond--*-Letter----");
		char ch1 = 'A';
		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if ((i + j) % 2 != 0 && i + j >= n + 1 && j - i <= n - 1 && i + j <= n * 3 - 1 && i - j <= n - 1) {
//					if (i + j == 10 || i + j == 6 || i + j == 8) {
					System.out.print(ch1 + " ");
				} else if ((i + j) % 2 == 0 && i + j >= n + 2 && i + j <= (n * 2) + 2 && j - i <= n - 2 && i - j < n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			if (i < 4)
				ch1++;
			else
				ch1--;

			System.out.println();

		}

		System.out.println("-----------Diamond--Letter-----");
		char ch3 = 'A';
		for (int i = 1; i <= (2 * n) - 1; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j >= n + 1 && i - j <= n - 1 && j - i <= n - 1 && i + j < n * 3) {
					if (i + j == 10 || i + j == 6 || i + j == 8) {
						System.out.print("* ");
					} else {
						System.out.print(ch3 + " ");

					}
				} else {
					System.out.print("  ");
				}
			}
			if (i < 4)
				ch3++;
			else
				ch3--;

			System.out.println();
		}

		System.out.println("-----------Diamond--*-Number----");

		for (int i = 1; i <= (2 * n) - 1; i++) {
			int ch2 = 1;
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j >= n + 1 && i - j <= n - 1 && j - i <= n - 1 && i + j < n * 3) {

					if ((i + j == 10 || i + j == 6 || i + j == 8))
						System.out.print("* ");
					else {
						System.out.print(ch2 + " ");
						ch2++;
					}
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();

		}

		System.out.println("-------upper----Triangle-------");

		for (int i = 1; i <= n; i++) {
			char ch2 = 'A';
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1) {
					if (i + j == 6 || i + j == 8 || i + j == 10)
						System.out.print("* ");
					else {
						System.out.print(ch2 + " ");
						ch2++;
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("-------upper----Triangle-------");

		for (int i = 1; i <= n; i++) {
			char ch2 = 'A';
			for (int j = 1; j <= (2 * n) - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1 && (i + j) % 2 != 0) {
					System.out.print(ch2 + " ");
					ch2++;
				} else if (i + j >= n + 1 && j - i <= n - 1 && (i + j) % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------Number-------");
		int n1 = 5;
		for (int i = 1; i <= n1; i++) {
			int num = i;
			for (int j = 1; j <= i; j++) {

				if (j == 2)
					num = num + 4;
				else if (j == 3)
					num = num + 3;
				else if (j == 4)
					num = num + 2;
				else if (j == 5)
					num = num + 1;
				System.out.print(num);
				System.out.print(" ");

			}
			System.out.println();
		}

	}
}
