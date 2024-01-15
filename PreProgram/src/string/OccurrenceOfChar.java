package string;

public class OccurrenceOfChar {

	public static void main(String[] args) {

		String s = "helloh";

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = Character.MAX_VALUE;
				}
			}
			if (ch[i] != Character.MAX_VALUE)
				System.out.println(ch[i] + " count is " + count);
		}
		
		String s1 = "Java Programming Language Java";

		int a = s1.length();
		int b = s1.replace("J", "").length();
		int occur = a - b;
		System.out.println("count is " + occur);
	}

}
