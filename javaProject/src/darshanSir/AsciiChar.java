package darshanSir;

import java.util.Scanner;

public class AsciiChar {

	public static void main(String[] args) {
		int[] arr = new int[128];
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;

		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0)
				System.out.println((char)(i)+"-->"+arr[i]);
		}

	}

}
