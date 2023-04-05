package Array;

public class FindUniquePair {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 1, 3, 4, 6 };
		int A = 0;
		for (int i = 0; i < a.length; i++)
		{
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					cnt++;
					break;
				} else
					A++;
			}
		}

		int[] B = new int[A];
		int bIndex = 0;
		for (int i = 0; i < a.length; i++) 
		{
			int cnt = 0;
			for (int j = 0; j < i; j++) 
			{
				if (a[i] == a[j])
				{
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				B[bIndex++] = a[i];
			}

		}
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				System.out.println(B[i] + " " + B[j]);
			}
		}

	}

}
