package string;

public class StringContainsNumber {

	public static void main(String[] args) {
		String s = "1515415";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				count++;
			}
		}
		if (count == s.length()) {
			System.out.println("only Numbers");
		} else {
			System.out.println("not Only Numbers");
		}

	}

}
