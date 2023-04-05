package Array;

public class secondmax {

	public static void main(String[] args) {
		int[] a = { 90, 1, 2, 4, 500, 5, 6, 78, 9 };
		int max = Integer.MIN_VALUE;// put the min value of interger then start the next
		for (int i = 0; i < a.length; i++) 
			if (a[i] > max)
				max = a[i];
		
			int max2 = Integer.MIN_VALUE;
			for (int i = 0; i < a.length; i++)
				if (a[i] != max && a[i] > max2)// if the first max ill be ignore cause second available
					max2=a[i];
			System.out.println(max);
					System.out.println(max2);
		}

	}
	// if the number is max then assign their and then print last max taken value
	// moving the max value
	// index(i) will start the 1 or 2


