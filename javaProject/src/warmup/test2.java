package warmup;

import java.util.Scanner;

public class test2 {
	public static String required(String s) {
		String res = "$_"+s+"_$";
		return res;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.println(required(name));

	}

}
