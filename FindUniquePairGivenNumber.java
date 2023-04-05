
public class FindUniquePairGivenNumber 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			2, 4, 3, 5, 6, -2, 4, 7, 8, 9
		}
		;
		int ele=7;
		myCode(a,ele);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int ele) 	
	{
		int unique=0;
		for(int i=0; i<a.length; i++)
		{
			int cnt=0;
			for(int j=i+1; j<a.length; j++)
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
			for(int j=i+1;j<b.length; j++)
			{
				if(b[i]+b[j]==ele)
				{
					System.out.println(b[i]+" "+b[j]);
				}
			}
		}
	}
}

/*
OutPut
2 5
4 3
-2 9
*/