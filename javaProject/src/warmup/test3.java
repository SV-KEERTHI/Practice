package warmup;

import java.util.Scanner;

public class test3 {
	public static double finalPrice(double p1,double p2,double p3,double p4) {
		double total_price=(p1+p2+p3+p4)*0.254;
		return total_price;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double p1 = s.nextDouble();
		double p2 = s.nextDouble();
		double p3 = s.nextDouble();
		double p4 = s.nextDouble();
		System.out.println(finalPrice(p1,p2,p3,p4));
		
		

	}

}
