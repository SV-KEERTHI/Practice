package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		s.nextLine();
		String[] arr = new String[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextLine();
		}
		String[] revArr = new String[size];
		for (int i = 0; i < size; i++) {
			revArr[i] = arr[size-1-i];
		}
		System.out.println(Arrays.toString(revArr));

	}

}
