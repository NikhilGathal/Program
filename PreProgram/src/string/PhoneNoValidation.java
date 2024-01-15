package string;

public class PhoneNoValidation {

	public static void main(String[] args) {

		String s = "7234567890";
		char ch = s.charAt(0);
		if (s.length() == 10) {
			if (ch >= '6' && ch <= '9') {
				boolean bool = true;
				for (int i = 1; i < s.length(); i++) {
					char ch1 = s.charAt(i);
					if (ch >= '0' && ch <= '9') {

					} else {
						bool = false;
						break;
					}
				}
				if (bool == true) {
					System.out.println("Valid");
				} else {
					System.out.println("Invalid");
				}
			} else {
				System.out.println("It should start with 6 - 9 ");
			}
		} else {
			System.out.println("Len should be 10");
		}

	}

}
