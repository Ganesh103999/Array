package Array;

import java.util.Arrays;

public class InsersionSort {

	public static void main(String[] args) {
		int[] a = { 33, 44, 22, 11, 55 };
		for (int i = 0; i < a.length; i++)

		{
			int temp = a[i];
			int j = i;
			{
				for (; j > 0; j--) {
					if (temp < a[j - 1]) {
						a[j] = a[j - 1];
					}

					else {
						break;
					}
				}
			}
			a[j] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// System.out.println(Arrays.toString(a));
	}
}
