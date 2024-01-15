package array;

public class LinearSearch {

	public static void main(String[] args) {

		int[] a = { 10, 5, 0, 70, 80, 90, 30 };
		int ele = 20;
		boolean bool = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				bool = false;
				break;
			}
		}

		if (bool == false) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}
	}

}
