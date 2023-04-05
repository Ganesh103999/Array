package Array;

import java.util.Arrays;

public class reverse {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;

		}
		System.out.println(Arrays.toString(a));
// Arrays.toString will be use in array print single line.
	}

}
//for k will use instead of Arrays.toString will be print
//for(int k=0; k<a.length; k++)
//System.out.println(a[k]+" ");