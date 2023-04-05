package Array;

import Pattern.odd;

public class EvenOddArray {

	public static void main(String[] args)
	{
		int[] a = { 2, 3, 4, 5, 6, 7, 8 };
		int evenArraySize = 0;
		int oddArraySize = 0;

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 == 0)
				evenArraySize++;
			else
				oddArraySize++;

		}

		int[] evenArray = new int[evenArraySize];
		int[] oddArray = new int[oddArraySize];
		int eindex = 0;
		int oindex = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 == 0)
				evenArray[eindex++] = a[i];
			else
				oddArray[oindex++] = a[i];

		}
		for (int i = 0; i < evenArraySize; i++)
		{
			System.out.println(evenArray[i]);
		}
		for (int i = 0; i < oddArraySize; i++)
		{
			System.out.println(oddArray[i]);
		}

	}

}
