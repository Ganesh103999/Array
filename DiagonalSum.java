package Array;

public class DiagonalSum {

	public static void main(String[] args) 
	 {
		int[][] a = { { 1, 2, 3, 4 }, 
				      { 5, 6, 7, 8 }, 
				      { 9, 1, 2, 3 }, 
				      { 4, 5, 6, 7 } };

		int sum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if (j - i == 0 || j + i == a.length - 1) 
				{
					sum = sum + a[i][j];

				}
			}
		}

		System.out.println(sum);

	}
}
