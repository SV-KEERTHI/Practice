package tcs;

import java.util.Scanner;

public class LargestInArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int Largest = Integer.MIN_VALUE;
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			if(arr[i] > Largest) {
				Largest= arr[i];
			}	
		}
		System.out.println(Largest);
	}

}
