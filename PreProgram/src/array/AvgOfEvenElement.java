package array;

public class AvgOfEvenElement {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 51 };
		int sum = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
				sum = sum + a[i];
			}
		}
		System.out.println("avg is " + sum / count);

	}

}
