package string;

import java.util.Arrays;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String s = "e sala cup namde";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String rev = "";
			String p = s1[i];
			for (int j = p.length() - 1; j >= 0; j--) {
				rev = rev + p.charAt(j);
			}
			System.out.print(rev + " ");
			s1[i] = rev;

		}
		System.out.println();
		System.out.println(Arrays.toString(s1));

	}

}
