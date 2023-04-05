package Array;

import java.util.Arrays;

public class PositivenegativeArray 
{

	public static void main(String[] args)
	{
		int[] a = { 11, 22, -44, -22, 34, -96, 44, 56 };

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] < 0 && a[j] > 0) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
//left positive                      i left 0
//right negative                     j right i+1

