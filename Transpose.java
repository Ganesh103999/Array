public class Transpose
{

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a= 
		{
			{
				1,52,3
			}
			,
			{
				4,23,5
			}
			,
			{
				5,4,52
			}
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[][] a) 
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}

