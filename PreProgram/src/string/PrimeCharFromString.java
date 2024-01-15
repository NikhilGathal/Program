package string;

public class PrimeCharFromString {

	public static void main(String[] args) {

		String s = "apple";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int n = ch;
			int count = 0;
			for (int j = 1; j <= n; j++) {

				if (n % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(ch);
			}
		}

	}

}
