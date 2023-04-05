package Array;

public class SaddlePoint
{

	public static void main(String[] args)
	{
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		boolean isSaddlePointFound = false;
		for (int i = 0; i < a.length; i++)     rowLoop:
			
			{
				for (int j = 0; j < a.length; j++)
				{
					boolean isSmallInRaw = true;
					for (int k = 0; k < a.length; k++) 
					{
						if (a[i][k] < a[i][j])
							isSmallInRaw = false;
					}
					boolean isLargeInCol = true;
					for (int k = 0; k < a.length; k++)
					{
						if (a[k][j] > a[i][j])
							isLargeInCol = false;

					}
					if (isLargeInCol == true && isSmallInRaw == true)
					{
						System.out.println(a[i][j]);
						isSaddlePointFound = true;
						break;
					}
				}
			}
		if (isSaddlePointFound == false) {
			System.out.println("not found");
		}
	}

}
