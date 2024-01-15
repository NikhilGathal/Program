package string;

import java.util.Arrays;

public class MergeString {

	public static void main(String[] args) {

		String a[] = { "a", "b", "c", "d", "e" };
		String b[] = { "f", "g", "h", "i" };
		String c[] = new String[a.length + b.length];

		int j = 0;
		for (int i = 0; i < a.length; i++) {
			c[j] = a[i];
			j++;
		}
		for (int i = 0; i < b.length; i++) {
			c[j] = b[i];
			j++;
		}

		System.out.println(Arrays.toString(c));

	}

}
