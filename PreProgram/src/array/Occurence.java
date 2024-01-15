package array;

public class Occurence {

	public static void main(String[] args) {

		int[] a = { 10, 2, 3, 2, 4, 10, 11, 2, 2, 10, 2, 10 };
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = (i + 1); j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
					a[j] = Integer.MAX_VALUE;
				//System.out.println(j + " " +a[j] + " "+i + " " + a[i] + " " + count);
				}
			}
			if (a[i] != Integer.MAX_VALUE)
				System.out.println(a[i] + " Count is " + count);
		}

	}

}
