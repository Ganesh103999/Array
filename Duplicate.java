package Array;

public class Duplicate {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 1, 2, 3 };
		int UniqueEle = 0;

		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) 
					{
					cnt++;
					break;
				}

			}
			if (cnt == 0) {
				UniqueEle++;
			}
		}
		int[] b = new int[UniqueEle];
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				b[index++] = a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
