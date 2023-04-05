package Array;

import java.util.Arrays;

public class Assi4CopyArray {

	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 44, 55, 66 };

		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];

		}
		for (int i = 0; i < a.length; i++)
			System.out.print(b[i]+" ");
	}

}
