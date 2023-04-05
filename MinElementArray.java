package Array;

public class MinElementArray {

	public static void main(String[] args) 
	{
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
		}
		System.out.println(min);
	}

}
//we can get the row and col of the that max then
//declear the row=0; col=0; 
//row=i
//col=j