package string;

public class PrintOnlyUniqueChar {

	public static void main(String[] args) {

		String s = "programming";

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = Character.MAX_VALUE;
				}

			}
			if (count == 1 && ch[i] != Character.MAX_VALUE) {
				System.out.print(ch[i] + " ");
			}
		}

	}

}
