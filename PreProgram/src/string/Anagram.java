package string;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "eat";
//		if (s1.length() == s2.length()) {
//			int count = 0;
//			for (int i = 0; i < s1.length(); i++) {
//				char ch = s1.charAt(i);
//				for (int j = 0; j < s2.length(); j++) {
//					if (ch == s2.charAt(j)) {
//						count++;
//						break;
//					}
//				}
//			}
//			if (count == s1.length()) {
//				System.out.println("anagram");
//			} else {
//				System.out.println("not anagram");
//			}
//		} else {
//			System.out.println("Not Anagram");
//		}

		// using ascii values

		if (s1.length() == s2.length()) {

			int sum1 = 0;
			for (int i = 0; i < s1.length(); i++) {
				sum1 = sum1 + s1.charAt(i);
			}
			int sum2 = 0;
			for (int i = 0; i < s2.length(); i++) {
				sum2 = sum2 + s2.charAt(i);
			}
			if (sum1 == sum2) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}

		} else {
			System.out.println("Not Anagram");
		}

	}

}
