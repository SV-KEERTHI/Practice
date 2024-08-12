package darshanSir;

import java.util.Scanner;

public class DuplicateChar {
	public static void main(String[] args) {
		int[] arr = new int[128];
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;

		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>1)//arr[i] ==1 --> unique , arr[i] > 0 --> All the occurrences
				System.out.println("Duplicate Char: "+"-->"+(char)(i));
		}
	}

}
