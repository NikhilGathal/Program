package string;

public class LargestWordString {

	public static void main(String[] args) {

		String s = "hello hi bye welcome";
		String s1[] = s.split(" ");
		String max = s1[0];
		String min = s1[0];
		for (int i = 0; i < s1.length; i++) {

			if (max.length() < (s1[i].length())) {
				max = s1[i];
			}
			if (min.length() > s1[i].length()) {
				min = s1[i];
			}
		}
		System.out.println("largest word " + max);
		System.out.println("Small word " + min);

	}

}
