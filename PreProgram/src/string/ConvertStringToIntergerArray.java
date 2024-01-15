package string;

import java.util.Arrays;

public class ConvertStringToIntergerArray {

	public static void main(String[] args) {

		String s = "apple";
		int n[] = new int[s.length()];
		for (int i = 0; i < n.length; i++) {
			n[i] = s.charAt(i);
		}
		System.out.println(Arrays.toString(n));

	}

}
