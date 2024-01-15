package string;

public class CountVowelConsonent {

	public static void main(String[] args) {

		String s = "wElcome";
		s = s.toLowerCase();
		int vcount = 0;
		int ccount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vcount++;
			} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vcount++;
			} else {
				ccount++;
			}

		}
		System.out.println("Vowels are " + vcount);
		System.out.println("Consonent are " + ccount);
	}

}
