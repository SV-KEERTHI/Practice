package darshanSir;

import java.util.Arrays;
import java.util.Scanner;

public class EvenCountOddCount {

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
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Even Count: "+even);
		System.out.println("Ood Count: "+odd);

	}

}
