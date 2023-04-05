package Array;

public class MinMaxDiff {

	public static void main(String[] args) {
		int[] a = { 90, 1, 2, 4, 500, 5, 6, 78, 9 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];

		}
		System.out.println(max);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		System.out.println(min);
		System.out.println(max - min);
	}

}
