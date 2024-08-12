package keshavaSir;

public class Mobile {
	double price;
	String brand;
	String os;
	double currency;
	void Recharge(double amount) {
		currency = currency + amount;
		System.out.println("Current Balance: " + currency);
	}
	void ChangeOs(String newos) {
		os = newos;
		System.out.println("Current OS : " + os); 
		
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.currency = 100;
		m1.Recharge(299);
		m1.os = "Mac";
		m1.ChangeOs("Windows");
	}

}
