package numberprogram;

public class SpyNumber {

	public static void main(String[] args) {
		
		int n = 123;
		int sum = 0;
		int pdt = 1;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			pdt = pdt * rem;
			n = n / 10;
		}
		if(sum == pdt)
		{
			System.out.println("Spy Number");
		}
		else 
		{
			System.out.println("Not Spy Number");
		}

	}

}
