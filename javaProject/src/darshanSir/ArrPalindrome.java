package darshanSir;

import java.util.Arrays;
import java.util.Scanner;

public class ArrPalindrome {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i]= s.nextInt();
		}
		System.out.println("User Array: "+Arrays.toString(arr));
		int i = 0;
		int j= arr.length-1;
		boolean isPalindrome = true;
		while (i<j) {
			if(arr[i] == arr[j]) {
				i++;
				j--;
			}
			else {
				isPalindrome = false;
				break;
			}
		}
		System.out.println(isPalindrome ? "Palindrome" :"Not Palindrome");


	}

}
