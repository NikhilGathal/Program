package string;

import java.util.Arrays;

public class UpperCase {

	public static void main(String[] args) {
		
		System.out.println("To convert uppercase");

		String s = "apple123";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				System.out.print((char) (ch - 32));
			} else {
				System.out.print(ch);
			}

		}
		System.out.println();
		System.out.println("To convert Lowercase");
		
		String s1 = "aAPPLE123";
		for (int i = 0; i < s1.length(); i++) {
			char ch1 = s1.charAt(i);
			if (ch1 >= 'A' && ch1 <= 'Z') {
				System.out.print((char) (ch1 +32));
			} else {
				System.out.print(ch1);
			}

		}
		

	}

}
