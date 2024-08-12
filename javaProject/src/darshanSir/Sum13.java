package darshanSir;

import java.util.Scanner;

public class Sum13 {
	static int Sum(int[] a) {
		boolean flag = true;
		int sum =0;
		if(a.length == 0) {
			return 0;
		}
		else {
			for (int i = 0; i < a.length; i++) {
				if(a[i] == 6) {
					flag = false;	
				}
				if(flag ==true) {
					sum+= a[i];
				}
				if(a[i]==7) {
					flag = true;
				}

			}
			return sum;
		}
	}

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i]= s.nextInt();
		}
		System.out.println(Sum(arr));

	}

}
