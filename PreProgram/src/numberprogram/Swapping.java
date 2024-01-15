package numberprogram;

public class Swapping {

	public static void main(String[] args) {

		// System.out.println("Swap using Temp variable");

		// int a = 10;
//		int b = 20;
//		int temp;
//
//		System.out.println("val before Swap");
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println("val after Swap");
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);

		System.out.println("Swap without using Temp variable");

		int a = 10;
		int b = 20;
		System.out.println("val before Swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int c = a + b;
		a = c - a;
		b = c - b;

		System.out.println("val after Swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
