package array;

class Employee {

}

class Student {

}

public class Create {

	public static void main(String[] args) {

		// int [] a = new int[4];

		int[] a = { 10, 20, 30, 40 };
		System.out.println(a.length);

		// System.out.println(Arrays.toString(a));

		Student s1 = new Student();
		Student s2 = new Student();
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		Student[] s = { s1, s2 };
		Employee[] e = { e1, e2 };

		Object[] obj = { 10, 20, true, s1, e2, "hello" };

	}

}
