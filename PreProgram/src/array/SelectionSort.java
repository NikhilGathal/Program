package array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int a[] = { 5, 1, -1, 2 };
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}

			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			System.out.println(Arrays.toString(a));
		}
		//System.out.println(Arrays.toString(a));

	}

}
