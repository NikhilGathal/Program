package numberprogram;

public class HappySadNumer {

	public static void main(String[] args) {

		int n = 4;
		while (n >0) {
			int sum = 0;
			while (n > 0) {
				int rem = n % 10;
				int sq = rem * rem;
				sum = sum + sq;
				n = n / 10;
			}
			System.out.println(sum);
			if (sum == 1) {
				System.out.println("Happy");
				break;
			} else if (sum == 4) {
				System.out.println("Sad");
				break;
			} else {
				n = sum;
			}
		}
	}

}
