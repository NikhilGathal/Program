package numberprogram;

public class PerfectNo {

	public static void main(String[] args) {

		int n = 28;
		int temp = n;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;

			}
		}
		if (temp == sum) {
			System.out.println("Given no is Perfect No");
		} else {
			System.out.println("Given no is not pPerfect No");
		}

	}

}
