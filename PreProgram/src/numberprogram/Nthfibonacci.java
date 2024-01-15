package numberprogram;

public class Nthfibonacci {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		int target = 8;
		for (int i = 1; i <= target; i++) {
			if (target == i) {
				System.out.println(n1);
			}
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
	}

}
