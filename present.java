package Array;

public class present {

	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int num = 65;
		int cnt = 0;    // if cnt will be put in zero then number is not given in data input
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == num)    // 'i' will be compare with the num is given number get findout
				cnt++;
		}
		if (cnt == 0)
			System.out.println("not present");
		else
			System.out.println("present");
	}

}
