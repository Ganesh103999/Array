package Array;

public class MaxEleArray {

	public static void main(String[] args) 
	{
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
//we can get the row and col of the that max then
//declear the row=0; col=0; 
//row=i
//col=j