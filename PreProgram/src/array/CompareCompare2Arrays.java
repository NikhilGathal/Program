package array;

import java.util.Arrays;

public class CompareCompare2Arrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4 };
		int[] c = new int[4];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c[k] = b[j];
					k++;
					 //System.out.print(b[j] + " ");
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
