package numberprogram;

public class Power {

	public static void main(String[] args) {

		int base = 5;
		int power = 3;
		int pdt = 1;
		for (int i = 1; i <= power; i++) {
			pdt = pdt * base;
		}

		System.out.println(pdt);
	}

}
