package string;

public class PrintOnlyUniqueString {

	public static void main(String[] args) {
		
		String s = "hello hi bye hello welcome ";
		
		String s1 [] = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			int count = 1;
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i].equals(s1[j])) {
					count++;
					s1[j] = "";
				}

			}
			if (count == 1 && s1[i]!= "") {
				System.out.print(s1[i] + " ");
			}
		}

	}

}
