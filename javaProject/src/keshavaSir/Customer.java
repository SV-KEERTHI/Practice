package keshavaSir;

import java.util.Scanner;

public class Customer {
	String cusName;
	double purchase;
	String type;
	void CustomerDetails( String cusName,double purchase,String type) {
		System.out.println("Customer Name: "+cusName);
		System.out.println("Customer Purchase cost: "+purchase);
		System.out.println("Customer type: "+type);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		String name = s.next();
		System.out.println("Enter Customer purchased cost: ");
		double cost = s.nextDouble();
		System.out.println("Enter Customer type: ");
		String type = s.next();
		Customer c1 = new Customer ();
		c1.CustomerDetails(name, cost, type);
		

	}

}
