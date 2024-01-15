package numberprogram;

public class Automorphic {

	public static void main(String[] args) {

		int n = 376;
		int sq = n * n;
		while(n>0)
		{
			int r1 = n%10;
			int r2 = sq%10;
			if(r1 == r2)
			{
				n=n/10;
				sq=sq/10;
			}
			else
			{
				System.out.println("Not automorphic");
				break;
			}
		}
		if(n==0)
		{
			System.out.println("automorphic");
		}
	}

}
