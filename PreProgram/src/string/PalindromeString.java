package string;

public class PalindromeString {

	public static void main(String[] args) {

		String s = "radar";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s);
		System.out.println(s1);
		if (s.equals(s1)) 
		// use equalsignorecase()
		{
			System.out.println("Palindrome");

		} else {
			System.out.println("Not palindrome");
		}

	}

}
