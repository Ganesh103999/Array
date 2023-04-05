public class MultiPlication
{
	// StartOfMainMethod
	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] c = new int[a.length][b[0].length];
		multi(a, b, c);
	}

	// EndOfMainMethod
	private static void multi(int[][] a, int[][] b, int[][] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int k = 0; k < b.length; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
