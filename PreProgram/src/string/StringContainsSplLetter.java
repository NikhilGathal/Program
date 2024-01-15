package string;

public class StringContainsSplLetter {

	public static void main(String[] args) {
		String s = "Nik5hil";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				 count++;
			}
		}
		if (count == s.length()) {
			System.out.println("only letters");
		} else {
			System.out.println("not Only letters");
		}
		
//		for (int i = 0; i < s.length(); i++) {
//		char ch = s.charAt(i);
//		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//			// count++;
//		} else if (ch >= '0' && ch <= '9') {
//			count++;
//		} else {
//			count++;
//		}
//	}
//	if(count> 0)
//	{
//		System.out.println("not only letters");
//	}
//	else
//	{
//		System.out.println("Only letters");
//	}


	}
}
