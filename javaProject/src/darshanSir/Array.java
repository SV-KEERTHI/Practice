package darshanSir;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		int sum =0;
		for (int i = 0; i < size; i++) {
			arr[i]= s.nextInt();
			sum += arr[i];
		}
		System.out.println("sum of elements: "+sum);

	}

}
