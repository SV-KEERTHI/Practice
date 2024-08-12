package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int Smallest = Integer.MAX_VALUE;
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			if(arr[i] < Smallest) {
				Smallest= arr[i];
			}	
		}
		System.out.println(Smallest);
	}

}
