package numberprogram;

public class MagicNumber {

	public static void main(String[] args) {

		int n = 1729;
		boolean flag = false;
		while (n >= 10)
		// bcz we cant add digits which are less than 10
		{
			int sum = 0;
			while (n > 0) {
				int rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			System.out.println(sum);
			if (sum == 1) {
				System.out.println("Magic");
				flag = true;
				break;
			} else {
				n = sum;
			}
		}
		if(flag == false)
		{
			System.out.println("Not a Magic");
		}

	}

}
