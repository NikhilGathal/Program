package array;

import java.util.Arrays;

public class RemoveElementArray {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = new int[a.length - 1];
		
		int index = 2;
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == index) {
			} else {
				b[j] = a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
