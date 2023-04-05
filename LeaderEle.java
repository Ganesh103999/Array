
package Array;

public class LeaderEle {

	public static void main(String[] args) {
		int[] a = { 22, 33, 11, 15, 9, 10 };
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					cnt++;
					break;
				}
			}
			if (cnt == 0)
				System.out.println(a[i]);
		}
	}

}
// if the given array last number = second last output then if a[j]>=a[i]
// cnt=0 then 'Leader element'
// cnt=1 then 'not Leader  element'
// j is always start with i+1