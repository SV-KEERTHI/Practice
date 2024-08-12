package keshavaSir;

import java.util.Scanner;

public class Laptop {
	static int id = 100001;
	String modelNum;
	int year;
	String brand;
	String model;
	double price;
	
	public Laptop(int year, String brand, String model, double price) {
		this.modelNum = "LAP101" + year + id++;
		this.year = year;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void display() {
		System.out.println("Model Number: " + modelNum);
		System.out.println("Year: " + year);
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.fill the details\n2.exit");
			int n = s.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter year: ");
				int year = s.nextInt();
				System.out.println("Enter brand: ");
				String brand = s.next();
				System.out.println("Enter model: ");
				String model = s.next();
				System.out.println("Enter price: ");
				double price = s.nextDouble();
				Laptop l1 = new Laptop(year,brand,model,price);
				l1.display();
				break;
			default:
				System.out.println("Thank you...");
				System.exit(0);
				break;
			}
			
		}
	}
}
