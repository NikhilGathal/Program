package numberprogram;

public class ArmstrongNo {

	public static void main(String[] args) {

		int n = 9;
		int temp = n;
		int temp1 = n;
		int count = 0;
		int sum = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		System.out.println(count);
		int rem;
		while (temp != 0) {
			int pdt = 1;
			rem = temp % 10;
			for (int i = 1; i <= count; i++) {
				pdt = pdt * rem;
			}
			System.out.println(pdt);
			sum = sum + pdt;
			temp = temp / 10;
		}
		System.out.println(sum);
		if (sum == temp1) {
			System.out.println("Armstrong no");
		} else {
			System.out.println("Not armstrong");
		}

	}

}
