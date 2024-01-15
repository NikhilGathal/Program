package array;

public class LargestOfArray {

	public static void main(String[] args) {
		
		int a [] = {-5,10,20,50,300};
		
		int max= a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
