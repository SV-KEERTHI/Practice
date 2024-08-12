package darshanSir;

import java.util.Scanner;

public class Arr1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		int val = 5;
		for (int i = 0; i < size; i++) {
			arr[i]=val;
			val += 5;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
