package darshanSir;

import java.util.Arrays;
import java.util.Scanner;

public class UserArr {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i]= s.nextInt();
		}
		System.out.println("User Array: "+Arrays.toString(arr));

	}
}
