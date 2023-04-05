package Array;

import java.util.Arrays;

public class AddChar {

	public static void main(String[] args) {
		char[] a = { 'a', 'b', 'c', 'd' ,'g'};
		char[] b = { 'x', 'y', 'z', 'w' };

		char[] c = new char[a.length + b.length];
		int cIndex = 0;
		for (int i = 0; i < a.length || i < b.length; i++) 
		
		
		
		
		{
			if (i < a.length)
				c[cIndex++] = a[i];
					
			if (i < b.length)
				c[cIndex++] = b[i];
		}
		for (int i = 0; i < c.length; i++)
		{
			System.out.println(c[i]);
		}
	}

}
