package Array;

public class UniqueSize {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 1, 3, 4, 5, 8 };//unique not repeat same as first
		int UniqueArraySize = 0;
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) { //
				//loops are given cause campare and 
				                              //itreate all element to each 
				if (a[i] == a[j]) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				UniqueArraySize++;
			}
		}
		System.out.println(UniqueArraySize);
	}

}
