package numberprogram;

public class SquarerootOfNumber {

	public static void main(String[] args) {

		int n = 25;
		for (int i = 1; i < n / 2; i++) {
			if (i * i == n) {
				System.out.println("sqroot of " + n + " is " + i);
				break;  // noothing change only internally it will stop iteration
			}
		}

	}

}
