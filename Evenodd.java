package Array;

import java.util.Arrays;

public class Evenodd {

	public static void main(String[] args) {
		int[] a = { 900, 2, 400, 6, 7, 88, 9 };
		int evenArraySize = 0;
		int oddArraySize = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				evenArraySize++;
			else
				oddArraySize++;
		}
		int[] evenArray = new int[evenArraySize];
		int[] oddArray = new int[oddArraySize];
		int evenIndex = 0;
		int oddIndex = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				evenArray[evenIndex++] = a[i];
			else
				oddArray[oddIndex++] = a[i];

		}
		
		for (int i = 0; i < evenArray.length; i++) {

			System.out.print(evenArray[i] + " ");
		}
		System.out.println();
		for (int j = 0; j < oddArray.length; j++) {
			System.out.print(oddArray[j] + " ");
		}

	}

}
