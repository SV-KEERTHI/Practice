package darshanSir;

import java.util.Scanner;

public class SimpleCalci {
	static int add(int a, int b) {
		return a+b;
	}
	static int sub(int a, int b) {
		return a-b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static int div(int a, int b) {
		return a/b;
	}
	static int mod(int a, int b) {
		return a%b;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("============Welcome to Simple Calculator============");
		while (true) {
			System.out.println("==========MENU=============");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
			System.out.println("Enter Option: ");
			int op = s.nextInt();
			int a=0,b=0;
			if(op >= 1 && op <= 5) {
				System.out.println("Enter your Values");
				a = s.nextInt();
				b = s.nextInt();
			}
			switch (op) {
			case 1:System.out.println("add: "+add(a,b));

			break;
			case 2:System.out.println("sub: "+sub(a,b));

			break;
			case 3:System.out.println("mul: "+mul(a,b));

			break;
			case 4:System.out.println("div: "+div(a,b));

			break;
			case 5:System.out.println("mod: "+mod(a,b));

			break;

			case 6:System.out.println("Thank you...!!!");
			System.exit(0);

			break;
			default:System.out.println("Invalid OPtion...!!!");
			break;
			}
		}

	}

}
