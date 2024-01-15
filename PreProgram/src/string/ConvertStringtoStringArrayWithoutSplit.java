package string;

import java.util.Arrays;

public class ConvertStringtoStringArrayWithoutSplit {

	public static void main(String[] args) {

		String s = "my name is smith";
//System.out.println(s.length());
		int count = 1;
		if (s.charAt(0) == ' ') {
			count = 0;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;
			}
			
		}
		 //System.out.println(count);
		String s1[] = new String[count];
		String s2 = "";
		int j = 0;
		for (int k = 0; k < s.length(); k++) {
			char ch = s.charAt(k);
			if (ch == ' ') {
				s1[j] = s2;
				s2 = "";
				j++;
			} else {
				s2 = s2 + ch;
			}
		}
		s1[j] = s2;
		System.out.println(Arrays.toString(s1));

	}

}
