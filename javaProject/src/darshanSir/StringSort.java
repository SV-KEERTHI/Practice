package darshanSir;

public class StringSort {

	public static void main(String[] args) {
		String s = "keerthi";
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		String ans = new String(arr);
		System.out.println(ans);

	}

}
