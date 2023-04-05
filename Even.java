package Array;

import java.util.Arrays;

public class Even {

	public static void main(String[] args) {
		int[] a = { 29, 34, 55, 600, 77, 66, 77, 65, 66, 23 };
		int oddArraySize = 0;
		int evenArraySize = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				evenArraySize++;
			else
				oddArraySize++;
		}
		int[] evenArray1 = new int[evenArraySize];
		int[] oddArray1 = new int[oddArraySize];

		int evenIndex = 0;
		int oddIndex = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				evenArray1[evenIndex++] = a[i];
			oddArray1[oddIndex++] = a[i];
		}
		System.out.println(Arrays.toString(evenArray1));
		System.out.println(Arrays.toString(oddArray1));

	}
}
