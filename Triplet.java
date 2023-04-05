package Array;

public class Triplet
{

	public static void main(String[] args) 
	{
		int[] a = { 5, 1, 3, 4, 7, 9 };

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] > a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i + 1; j < a.length; j++) 
			{
				for (int k = j + 1; k < a.length; k++) 
				{
					if (a[i] + a[j] + a[k] < 12)
					{
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}

	}

}
