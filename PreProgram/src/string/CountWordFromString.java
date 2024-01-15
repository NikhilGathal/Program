package string;

import java.util.Arrays;

public class CountWordFromString {

	public static void main(String[] args) {

		String s = "  hello hi wel come a";
//		int count = 1;
//		if (s.charAt(0) == ' ') {
//			count = 0;
//		}
//		for (int i = 0; i < s.length() - 1; i++) {
//			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
//				count++;
//			}
//		}
//		System.out.println(count);

		String[] s1 = s.split(" ");
		//System.out.println(Arrays.toString(s1));
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != "") {
				count++;
			}
		}
		System.out.println(count);

	}

}
