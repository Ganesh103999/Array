
package Array;

public class PairingWithDuplicateRemove {

	public static void main(String[] args) {
		int[] a = { 11,22,33};
		int UniqueEleCnt = 0;
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j])
					cnt++;
			}
			if (cnt == 0)
				UniqueEleCnt++;
		}
		int[] UniqueArray = new int[UniqueEleCnt];
		int UniqueIndex = 0;
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j])
					cnt++;

			}
			if (cnt == 0) {

				UniqueArray[UniqueIndex++] = a[i];

			}
		}
		for (int i = 0; i < UniqueArray.length; i++) {
			for (int j = 0; j < UniqueArray.length; j++) {
				System.out.println(a[i] + " " + a[j]);
			}
		}

	}// we will don't know number is duplicate or shorting that's why first duplicate will remove

}
