package Array;

public class SubArray {

	public static void main(String[] args) {

		
		int[] a = { 3, 7, 90,20, 5, 50, 40 };

		int sizeSubArray = 3;

		int min = Integer.MAX_VALUE;
		int Index = 0;
		for (int i = 0; i < a.length - sizeSubArray; i++) {
			int sum = 0;
			for (int j = i; j < i + sizeSubArray; j++) {
				sum = sum + a[j];

			}
			if (sum < min) {
				min = sum;
				Index = i;
			}

			
		}
		System.out.println(Index+" "+min+" "+min/sizeSubArray);

	}

}
