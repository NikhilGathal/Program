package loops;

public class P3 {

	public static void main(String[] args) {

		System.out.println("By using for loop");

		for (int i = 1; i <= 2; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
				// System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("By using While loop");

		int i = 1;

		while (i <= 2) {
			int j = 1;

			while (j <= 5) {
				System.out.print(j + " ");
				j++;
			}
			System.out.println();
			i++;
		}

		System.out.println("By using do While loop");

		int k = 1;
		do {
			int l = 1;
			do {
				System.out.print(l + " ");
				l++;

			} while (l <= 5);
			System.out.println();
			k++;
		} while (k <= 2);

	}

}
