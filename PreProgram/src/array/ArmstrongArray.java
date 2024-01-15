package array;

import java.util.Arrays;

public class ArmstrongArray {

	public static void main(String[] args) {
		int [] b = new int[6];
		int[] a = { 9, 153, 1634, 24, 96, 5 };
		for (int i1 = 0; i1 < a.length; i1++) {

			int n = a[i1];
			int temp1 = n;
			int temp = n;
			int count = 0;
			int sum = 0;
			while (n != 0) {
				count++;
				n = n / 10;
			}
			//System.out.println(count);
			int rem;
			while (temp != 0) {
				int pdt = 1;
				rem = temp % 10;
				for (int i = 1; i <= count; i++) {
					pdt = pdt * rem;
				}
				//System.out.println(pdt);
				sum = sum + pdt;
				temp = temp / 10;
			}
			//System.out.println(sum);
			if (sum == temp1) {
			b[i1] = sum;
			// all are same
//				System.out.println(temp1);
//				System.out.println(b[i1]);
//				System.out.println(sum);
			} 
		}
		//System.out.println(Arrays.toString(b));
	}

}
