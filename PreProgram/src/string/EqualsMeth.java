package string;

public class EqualsMeth {

	public static void main(String[] args) {
		
		
		String s1 = "java";
		String s2 = new String("java");
		String s3 = "java";
		String s4 = new String("Java");
		
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		

	}

}
