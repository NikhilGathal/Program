package array;

import java.util.Arrays;

public class InsertInArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6 };
		int[] b = new int[a.length + 1];
		int element = 5;
		int index = 4;
		int j = 0;
		for (int i = 0; i < b.length; i++) {
			if (i == index) {
				b[i] = element;
			} else {
				b[i] = a[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
