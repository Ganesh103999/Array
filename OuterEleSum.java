package Array;

public class OuterEleSum {

	public static void main(String[] args) {
		int[][] b = { { 1, 2, 3, 4 }, { 4, 5, 6, 8 }, { 7, 8, 9, 3 }, { 3, 8, 1, 9 } };

		int sum = 0;
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++)
			{
				if (i == 0 || i == 3 || j == 0 || j == 3)// inner element can print then
					// i!=0 && i!=3 && j!=0 && j!=3
					sum += b[i][j];
			}

		}
		System.out.println(sum);
		

	}

}
