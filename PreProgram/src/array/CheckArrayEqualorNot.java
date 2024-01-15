package array;

public class CheckArrayEqualorNot {

	public static void main(String[] args) {
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 4 };

//		boolean bool = Arrays.equals(a1, a2);
//		if(bool == true)
//		{
//			System.out.println("Equal");
//		}
//		else 
//		{
//			System.out.println("Not equal");
//		}

		// Approach

		boolean status = true;
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] == a2[i]) {
					status = true;
				}
			}
		} else {
			status = false;
		}

		if (status == true) {
			System.out.println("Arry equal");
		} else {
			System.out.println("Not equal");
		}

	}

}
