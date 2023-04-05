package Array;

public class Rotate {

	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 44, 55, 66 };
		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {//cause itrating will stop before the last one
			a[i] = a[i + 1];

		}
		a[a.length - 1] = temp;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}

