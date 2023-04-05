package Array;

public class LeaderReverseAP {

	public static void main(String[] args) 
	{
		int[] a = { 11, 22, 3, 3, 55, 6, 7, 88 };
		int leader = a[a.length - 1];
		System.out.println(leader);

		for (int i = a.length - 2; i >= 0; i--)
		{
			if (a[i] > leader)
			{
			
				System.out.println(a[i]);
				leader = a[i];
			}
		}

	}

}
