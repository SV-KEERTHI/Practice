package darshanSir;

import java.util.Scanner;

public class MissingNum {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter min: ");
		int min = s.nextInt();
		System.out.println("Enter max: ");
		int max = s.nextInt();
		System.out.println("Enter elements: ");
		for (int i = 0; i < size; i++) {
			arr[i]= s.nextInt();

		}
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i+1] - arr[i] != 1) {
//				System.out.println("Missing Num: "+(arr[i]+1));
//				break;
//			}
//
//		}
				min = s.nextInt();
				max= arr.length-1;
				int sum1 = 0;
				for (int i = 0; i < arr.length; i++) {
					sum1 += arr[i];
				}
				int sum2 =(max * (max + 1)) / 2 - (min * (min - 1)) / 2;
				
				System.out.println(sum1-sum2);
	}

}
