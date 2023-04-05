package Array;
public class tp {
	
		public static void main(String[] args) 
		{
			//arr.41
			int i, len = 0, a[] = {1, 2, 3, 4, 5, 42, 6, 7, 8, 9, 10};
	        do {
	            len = len + 1;
	        } while (a[len - 1] != 42);
	        for (i = 0; i < len - 1; i++) 
	        {
	            System.out.print(a[i] + " ");
	        }
		}
	}

