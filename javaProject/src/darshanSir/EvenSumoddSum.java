package darshanSir;

import java.util.Scanner;

public class EvenSumoddSum {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i]= s.nextInt();
		}
		int even =0,odd=0;
		for (int i = 0; i < size; i++) {
			if(arr[i] % 2 ==0) {
				even += arr[i];
			}
			else {
				odd += arr[i];
			}
		}
		System.out.println("Even Sum: "+even);
		System.out.println("Ood Sum: "+odd);

	}

}
