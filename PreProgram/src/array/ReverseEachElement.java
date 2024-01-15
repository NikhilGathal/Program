package array;

import java.util.Arrays;

public class ReverseEachElement {

	public static void main(String[] args) {

		int[] a = { 209, 32, 52, 426, 725 };
		int reverse[]= new int[5];
		for (int i = 0; i < a.length; i++) {
			int rem;
			int rev = 0;
			int n = a[i];
			while (n != 0) {
				rem = n % 10;
				rev = 10 * rev + rem;
				n = n / 10;

			}
			reverse[i]=rev;
			
		}
		System.out.println(Arrays.toString(reverse));

	}

}
