package darshanSir;

import java.util.Arrays;
import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int max = arr[0];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i]= s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for (int i : arr) {
			if(i> max) {
				max = i;
			}
			if(i< min) {
				min = i;
			}
			
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

}
