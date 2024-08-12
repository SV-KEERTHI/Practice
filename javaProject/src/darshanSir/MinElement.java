package darshanSir;

import java.util.Scanner;

public class MinElement {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			arr[i]= s.nextInt();
		}
		for (int i = 0; i < size; i++) {
			if(arr[i] < smallest)
				smallest = arr[i];
		}
		int largest = arr[0];
		
		for (int i = 1; i < size; i++) {
			if(arr[i] > largest)
				largest = arr[i];
		}
		System.out.println("Largest Element: "+largest);
		System.out.println("Smallest Element: "+smallest);
		System.out.println("sum of min and max: "+(largest+smallest));
		System.out.println("Diff of min and max: "+(largest-smallest));

	}

}
