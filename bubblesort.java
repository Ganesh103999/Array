package Array;

import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {
		int[] a = { 15, 34, 24, 5, 67, 88, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(a));
		

	}

}
