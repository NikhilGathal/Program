package string;

public class CountSpaces {

	public static void main(String[] args) {

		String s = "   Good  Morning   ";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("No of spaces are " +  count);

	}

}
