package Array;

public class sum {

	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 44 };
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum = sum + a[i];
		System.out.println(sum);
		int avg = sum / a.length;
		System.out.println(avg);

	}

}


