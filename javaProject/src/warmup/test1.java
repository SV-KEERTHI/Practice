package warmup;

import java.util.Scanner;

public class test1 {
	private static void print(String name ,int age) {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		int age = s.nextInt();
		print(name,age);
		

	}

}
