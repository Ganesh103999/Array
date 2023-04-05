public class CheckEqualityTwoArray
{

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,4,5
		}
		;
		int[] b= 
		{
			1,2,3,5,4
		}
		;
		myCode(a,b);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int[] b) 
	{
		int output=areTheySame(a,b);
		if(output==0)
		System.out.println("not same");
		else
		System.out.println("same");
	}
	private static int areTheySame(int[] a,int[] b)
	{
		if(a.length!=b.length)
		return 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=b[i])
			return 0;
		}
		return 1;
	}
}

