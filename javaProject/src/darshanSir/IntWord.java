package darshanSir;

import java.util.Scanner;

public class IntWord {
	public static String word(int num) {
		String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		for (int i = 0; i < arr.length; i++) {
			if(num == i) {
				return arr[i];
			}
		}
		return "";
	}
	public static String word1(int num) {
		String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String s = num +"";
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			ans = ans+arr[s.charAt(i)-48];
		}
		return ans;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		String res = "";
//		while(n != 0) {
//			int rem = n%10;
//			res = word(rem)+res;
//			n /= 10;
//		}
//		System.out.println(res);
		System.out.println(word1(n));
	}

}
