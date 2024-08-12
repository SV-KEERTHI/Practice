package darshanSir;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		int largest = arr[0];
		for (int i = 0; i < size; i++) {
			arr[i]= s.nextInt();
		}
		for (int i = 1; i < size; i++) {
			if(arr[i] > largest)
				largest = arr[i];
		}
		System.out.println("Largest Element: "+largest);

	}

}
