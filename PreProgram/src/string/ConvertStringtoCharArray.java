package string;

import java.util.Arrays;

public class ConvertStringtoCharArray {

	public static void main(String[] args) {

		String s = "welcome";
//		System.out.println(s.length());
		char ch[] = new char[s.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = s.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
	}

}
