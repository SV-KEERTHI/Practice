package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();	
		}
		System.out.println("original");
		System.out.println(Arrays.toString(arr));
		int[] revArr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			revArr[i] = arr[arr.length - 1 - i];
		}
		System.out.println("reversed");
		System.out.println(Arrays.toString(revArr));
	}

}
