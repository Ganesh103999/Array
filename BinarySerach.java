package Array;

public class BinarySerach {

	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 44, 55, 66, 77 };
		int start = 0;
		int end = a.length;
		int ele = 44;

		while (true) {
			int mid = (start + end) / 2;
			if (a[mid] == ele) {
				System.out.println(mid);
				break;
			}
			if (ele > a[mid])
				start = mid + 1;
			else if (ele < a[mid])
				end = mid - 1;
			if (start > end) {
				System.out.println("not found");
				break;
			}//how many iteration not given thats why while loop is given
			//condition element is grater to the mid then start will start mid +1
			//condition element is less to the mid then end will start mid -1
			// 
			//ele is out of array then end=a.length-1

		}
	}

}
