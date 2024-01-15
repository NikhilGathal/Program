package string;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		String s = "  Good   Morning ";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				char ch = s.charAt(i);
				System.out.print(ch);
			}
		}
		

	}

}
