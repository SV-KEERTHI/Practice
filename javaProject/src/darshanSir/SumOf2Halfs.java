package darshanSir;

import java.util.Scanner;

public class SumOf2Halfs {
	static int length(int num) {
		int count = 0;
		while(num != 0) {
			int rem = num % 10;
			count++;
			num /= 10;
		}
		return count;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int n1 = 0,n2 = 0;
		if(length(num)/2 % 2 == 0) {
			n1= (int) (num % Math.pow(10, length(num)/2));
			n2 = (int) (num / Math.pow(10, length(num)/2));
			int sum = n1+n2;
			System.out.println("Sum of 2 Halves: "+sum);
			
			}
			else {
				System.out.println("enter even digit Number");
			}

		}

	}
