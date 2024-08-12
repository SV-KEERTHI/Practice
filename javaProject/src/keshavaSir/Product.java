package keshavaSir;

import java.util.Scanner;

public class Product {
	static int pid_start = 101;
	final static int pid=pid_start++;
	             String color;
	             String mfg;
	             String exp;
	             double cost;
	             double tax;
	public Product(String color,String mfg,String exp,double cost,double tax) {
		this.color = color;
		this.mfg = mfg;
		this.exp = exp;
		this.tax = tax;

	}
	void total_price(double cost,double tax) {
		double total = cost+tax;	
		System.out.println("total price: "+total);
	}
	void productDetailsDisplay() {
		System.out.println(pid);
		System.out.println(color);
		System.out.println(mfg);
		System.out.println(exp);
		System.out.println(tax);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter product color:");
		String color = s.next();
		System.out.println("Enter product mfg:");
		String mfg = s.next();
		System.out.println("Enter product exp:");
		String exp = s.next();
		System.out.println("Enter product cost:");
		double cost = s.nextDouble();
		System.out.println("Enter product tax:");
		double tax = s.nextDouble();
		
		Product p1 =  new Product(color,mfg,exp,cost,tax);
		p1.productDetailsDisplay();
		p1.total_price(cost, tax);
	}

}
