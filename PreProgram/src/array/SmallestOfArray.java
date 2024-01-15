package array;

public class SmallestOfArray {

	public static void main(String[] args) {
		int a[] = { -5, 10, 20, 50, 300 };

		int min = a[0];
		for (int i = 0; i < a.length ; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);

	}

}
