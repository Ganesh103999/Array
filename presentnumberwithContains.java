package Array;

public class presentnumberwithContains {

	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int num = 65;
		// if cnt will be put in zero then number is not given in data input

		if (contains(a, num) == 0) // 'i' will be compare with the num is given number get findout
			System.out.println("not present");
		else
			System.out.println("present");
	}

	private static int contains(int[] a, int num) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
if(a[i]==num)
	cnt++;
		}
		return cnt;
	}

	
}
