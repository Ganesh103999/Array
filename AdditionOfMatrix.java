public class AdditionOfMatrix
{
	public static void main(String args[])
	{
		int[][] a=
		{
			{
				1,2,3
			}
			,
			{
				4,5,6
			}
			,
			{
				7,8,9
			}
		}
		;
		int[][] b=
		{
			{
				1,2,3
			}
			,
			{
				4,5,6
			}
			,
			{
				7,8,9
			}
		}
		;
		int[][] c=new int[a.length][a[0].length];
		add(a,b,c);
	}
	//EndOfMainMethod
	private static void add(int[][] a, int[][] b, int[][] c) 
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

/*
OutPut
2 4 6 
8 10 12 
14 16 18 

*/

