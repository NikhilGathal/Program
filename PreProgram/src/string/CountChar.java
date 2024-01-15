package string;

public class CountChar {

	public static void main(String[] args) {

		String s = "tom123@gmail.com";
		int lcount = 0;
		int dcount = 0;
		int scount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z')|| (ch >= 'A' && ch <= 'Z')) {
				lcount++;
			} else if (ch >= '0' && ch <= '9') {
				dcount++;
			} else {
				scount++;
			}
		}
//		char [] ch = s.toCharArray();
//		
//		for (int i = 0; i < s.length(); i++) {
//			if ((ch[i] >= 'a' &&ch[i] <= 'z')|| (ch[i]  >= 'A' && ch[i]  <= 'Z')) {
//				lcount++;
//			} else if (ch[i]  >= '0' && ch[i] <= '9') {
//				dcount++;
//			} else {
//				scount++;
//			}
//		}
		
		System.out.println("No of letters are " + lcount);
		System.out.println("No of digits are " + dcount);
		System.out.println("No of splchar are " + scount);
	}

}
