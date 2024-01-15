package string;

import java.util.Arrays;

public class FirstLetterOfEachWordToUpeer {

	public static void main(String[] args) {

		String s = "my name is smith";
		String[] a = s.split(" ");
//		for(int i=0;i<a.length;i++)
//		{
//			String str = a[i];
//			for(int j=0;j<1;j++)
//			{
//			 char ch = str.charAt(0);
//			 System.out.print((char) (ch - 32) );	
//			}
//			for(int k=1;k<str.length();k++)
//			{
//				char ch1 = str.charAt(k);
//				System.out.print(ch1 );
//			}
//			System.out.print(" ");
//			
//		}

		for (int i = 0; i < a.length; i++) {
			String str = a[i];
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch >= 'a' && ch <= 'z' && j == 0) {
					System.out.print((char) (ch - 32));
				} else {
					System.out.print(ch);
				}
			}
			System.out.print(" ");
		}

	}

}
