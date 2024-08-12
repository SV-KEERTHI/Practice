package oops;

public class Admin extends Developer {

	public void manage() {
		System.out.println("manage code");
		super.read();
	}
	public void read() {
		System.out.println("Admin read code");
		
	}

}
