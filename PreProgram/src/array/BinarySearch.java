package array;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 5, 3, -1, 2, 11, 20, 6 };
		Arrays.sort(a);
		int ele = 110;
		int l = 0;
		int r = a.length-1;
		boolean bool = false;
		// System.out.println(Arrays.toString(a));
		while (l <= r) {
			int m = (l + r) / 2;
			if (ele == a[m]) {
				bool = true;
				break;
			} else if (ele > a[m]) {
				l = m + 1;
			} else if (ele < a[m]) {
				r = m - 1;
			}
		}
		if (bool == true) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}

	}

}
