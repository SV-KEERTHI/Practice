package keshavaSir;

import java.util.Scanner;

public class ObjectPen {
	double price;
	String color;
	String brand;
	void write(String color){
		System.out.println("Written using "+color+" pen");
	}
	void refill(){
		System.out.println("Filled");
	}
	void colorChange(String newColor){
		color= newColor;
		System.out.println("Written using "+color+" pen");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		double price = s.nextInt();
		String color = s.nextLine();
//		String brand = s.nextLine();
		ObjectPen p = new ObjectPen();
		p.write(color);
		p.refill();
		p.colorChange("pink");



	}

}
