package numberprogram;

public class SunnyNumber {

	public static void main(String[] args) {

		int n = 5;
		int m = n + 1;
		boolean bool = false;
		for (int i = 1; i < m / 2; i++) {
			if (m == i * i) {
				
				bool = true;
				break;
			}
		}
		if (bool == true) {
			System.out.println("Given no is sunny");
		} else {
			System.out.println("Given no is not sunny");
		}
	}

}
