
public class MinMaxDiffrence
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a=
		{
			11,22,33,44,55
		}
		;
		diff(a);
	}
	//EndOfMainMethod
	private static void diff(int[] a) 
	{
		int min=Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			min=a[i];
		}
		int max=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			max=a[i];
		}
		System.out.println("max "+max);
		System.out.println("min "+min);
		System.out.println(max-min);
	}
}


/*
Expected Output:
max 55
min 11
44
*/