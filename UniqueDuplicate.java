
package Array;

import java.util.Iterator;

public class UniqueDuplicate {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 1, 3, 4, 6 };
		int UniqueElecnt = 0;
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
				UniqueElecnt++;
			}
		}
		//System.out.println(UniqueElecnt);
		int[] UniqueArr = new int[UniqueElecnt];
		int UniqueIndex = 0;
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) 
			{
				UniqueArr[UniqueIndex++] = a[i];

			}

		}
		for (int i = 0; i < UniqueArr.length; i++) {
			System.out.print(UniqueArr[i] + " ");
		}
	}

}
