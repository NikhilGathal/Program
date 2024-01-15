package numberprogram;

public class PerfectSquare {

	public static void main(String[] args) {

		int n = 169;
		int root = 0;
		for (int i = 1; i < n / 2; i++) {
			if (n == i * i) {
				root++;
				break;
			}

		}
		if (root > 0) {
			System.out.println("given num is perfect square");
		} else {
			System.out.println("given num is not perfect square");
		}

	}

}
