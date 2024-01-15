package string;

import java.util.Arrays;

public class RemoveExtraSpace {

	public static void main(String[] args) {

		String s = "java   is    a   programming  lang";
		
		
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != "") {
				System.out.print(s1[i] + " ");
			}
		}
		
//		for(int i = 0;i<s.length()-1;i++)
//		{
//			if(s.charAt(i) == ' ' && s.charAt(i+1)==' ')
//			{	
//			}
//			else
//			{
//				System.out.print(s.charAt(i));
//			}
//		}
	}

}
