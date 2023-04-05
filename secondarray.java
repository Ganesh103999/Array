package Array;

public class secondarray


{

	public static void main(String[] args)
	{
		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) 
		{
			b[i] = a[i];
		}
		for (int i = 0; i < b.length; i++)
			System.out.println(b[i]);
	}

}
//when the add the data a to b will new copy given assign the data for b