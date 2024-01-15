package string;

public class RemoveBeginEndSpaceWithoutTrim {

	public static void main(String[] args) {
		
		String s = "   wel   come   ";
		int st = 0;
		int en = s.length()-1;
		for(int i = st;i<en;i++)
		{
			if(s.charAt(st) == ' ')
			{
				st++;
			}
			else if(s.charAt(en) == ' ')
			{
				en--;
			}
		}
		System.out.println(st + " " + en);
		System.out.println(s.charAt(st) + " " + s.charAt(en));
		System.out.println(s.substring(st,en+1)); // begin count from 0 end count from 1
//		for(int i=st;i<=en;i++)
//		{
//			char ch = s.charAt(i);
//			System.out.print(ch);
//		}

	}

}
