public class SumOfDiagRec
{
	public static void main(String[] args)
	{
	   int[][] a = { { 5, 1, 3 }, { 2, 4, 3 }, { 4, 3, 2 } };
int sum=0;

int i=0;
sum=loopI(a,i,sum);
System.out.println(sum);
	}
	private static void loopI(int[] a, int i, int sum)
	{
		if(i<a.length)
		{
			int j=0;
			sum=loopJ(a,j,sum);
			
			i++;
			return loopI(a,i,sum);
		}
		retrun sum;
	}
	private static void loopJ(int[] a, int j, int sum)
	{
		if(j<a.length)
		{
			if(j+i==a.length-1)
			{
				sum=sum+a[i][j];
			}
			j++;
			return loopJ(a,j,sum);
		}
		return sum;
	}

}
			