package string;

import java.util.Arrays;

public class Panagram {
	public static void main(String[] args) {
		String s = "qqwertyuiopasdfghjklzxcvbnm";
		char ch[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '%';
				}
			}
		}
		for (int k = 0; k < ch.length; k++) {
			if (ch[k] >= 'a' && ch[k] <= 'z') {
				count++;
			}
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(count);
		if (count == 26) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not panagram");
		}

	}

}
