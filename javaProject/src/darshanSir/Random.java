package darshanSir;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// In olden days used to generate otps and try in constructors id 
		//System.out.println((int)(Math.random()*n));
		String[] arr = {"kiki","Miss","Anna"};
		int i = (int)(Math.random()*n);
		System.out.println(arr[i]);
		
		if("Anna".equals(arr[2])) {
			System.out.println("Nanna");
		}
	}

}
