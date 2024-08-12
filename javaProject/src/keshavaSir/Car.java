package keshavaSir;

import java.util.Scanner;

public class Car {
	String brand;
	String Engine;
	String fuel;
	int seats;
	String model;
	void CarDetails(String brand,String engine,String fuel,String seats,String model) {
		System.out.println("Car details...");
		System.out.println("brand: "+brand);
		System.out.println("engine: "+Engine);
		System.out.println("fuel: "+fuel);
		System.out.println("seats: "+seats);
		System.out.println("model: "+model);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter brand: ");
		String brand = s.next();
		System.out.println("Enter engine type: ");
		String engine = s.next();
		System.out.println("Enter fuel type: ");
		String fuel = s.next();
		System.out.println("Enter seats: ");
		int seats = s.nextInt();
		System.out.println("Enter model: ");
		String model = s.next();
		Car c1 = new Car();
		c1.CarDetails(brand, engine, fuel, fuel, model);
		
	}

}
