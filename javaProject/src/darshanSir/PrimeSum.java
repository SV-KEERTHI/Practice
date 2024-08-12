package darshanSir;

import java.util.Scanner;

public class PrimeSum {
	static boolean isPrime(int num) {
		if (num <= 1) {
            return false;
        }
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i]= s.nextInt();
		}
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			if(isPrime(arr[i])) {
				sum += arr[i];
			}
		}
		System.out.println("Prime Numbers Sum in Array: "+sum);
	}

}
