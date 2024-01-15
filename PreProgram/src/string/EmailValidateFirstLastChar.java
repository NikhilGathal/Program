package string;

public class EmailValidateFirstLastChar {

	public static void main(String[] args) {

		String s = "1tols@gmail.com";
		//System.out.println(s.length());
		System.out.println(s.charAt(4));
		int diff = s.length() - 10;
		System.out.println(diff);
		char ch1 = s.charAt(0);
		char ch2 = s.charAt(s.length() - 11);
		System.out.println(ch1 + " " + ch2);
		System.out.println();

		if ((ch1 >= 'a' && ch1 <= 'z' || ch1 >= '0' && ch1 <= '9')
				&& (ch2 >= 'a' && ch2 <= 'z' || ch2 >= '0' && ch2 <= '9')) 
		{
			boolean bool = true;
			for (int i = 0; i < diff - 1; i++) 
			{
				char ch = s.charAt(i);
				if (ch >= 'a' && ch <= 'z' || ch1 >= '0' && ch1 <= '9' || (ch == '.' && s.charAt(i + 1) != '.')) 
				{

				} 
				else 
				{
					bool = false;
					break;
				}
			}

			String domain = s.substring(diff, s.length());
			System.out.println(domain);
			String mailservice = "@gmail.com";

			if (bool == true && domain.endsWith(mailservice) && (diff >= 6 && diff <= 30)) {

				System.out.println("valid Email");

			} else {
				System.out.println("Invalid Email");
			}

		} else {
			System.out.println("Invalid Email");
		}
	}

}
