package array;

public class EvenIndex {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 51 ,0,0,0};

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
