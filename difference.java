package Array;

public class difference {

	public static void main(String[] args) {
		int[] a = { 1, 23, 4, 5, 6, 4, 44, 66, 7 };
		int max = 0;
		int min = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];

			
				if (a[i] > max)
					max = a[i];
		}
		System.out.println(max - min);
	}

}
