package array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		//int[] a = { 90, 70, 21, -1, 55 };
		int [] a = {29,-1,20,5,8};
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(Arrays.toString(a)); // output of each iteration
		}
		//System.out.println(Arrays.toString(a)); // only last output

	}
}
