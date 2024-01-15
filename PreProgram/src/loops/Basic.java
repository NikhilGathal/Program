package loops;

public class Basic {

	public static void main(String[] args) {

//		int n = 5;
//		System.out.println(n % 10);
//		int[] a = new int[4];
//		a[-1] = 200;
//		System.out.println(a.length);
		
//		char ch = '1';
//		System.out.println((ch));
		
//		String s = "hello";
//		String s1 = "hello";
//		System.out.println(s==s1);
		
//		String s2 = "@welcome";
//		System.out.println(s2.length());
//		String s3 = "@welvome2";
//		System.out.println(s3.length());
		
		
		
		int n = 4;
		System.out.println("----------------L-Shape------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
		
		System.out.println("----------------L-Shape------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 4 || j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
		
		System.out.println("----------------L-Shape------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}

		System.out.println("----------------L-Shape------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i ==4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}

		System.out.println("----------------L-Shape------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}

		
		
		
				
	}

}
