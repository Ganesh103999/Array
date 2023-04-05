
public class RemoveDuplicate 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,3,5,6,2,3,4,5,97,1,23,
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		int unique=0;
		for(int i=0; i<a.length; i++)
		{
			int cnt=0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
			if(cnt==0)
			unique++;
		}
		int[] b=new int[unique];
		int index=0;
		for(int i=0; i<a.length; i++)
		{
			int cnt=0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
			if(cnt==0)
			b[index++]=a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
/*
OutPut
1 
3 
5 
6 
2 
4 
97 
23 

*/
