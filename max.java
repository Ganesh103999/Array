package Array;

public class max {

	public static void main(String[] args) {
		int[] a = { 90, 1, 2, 4, 500, 5, 6, 78, 9 };
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			
			
		}
		System.out.println(max);
	}

}
//if the number is max then assign their and then print last max taken value
//moving the max value 
//index(i) will start the 1 or 2
