package darshanSir;

public class NestedFor {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("innerloop started");
			for (int j = 0; j < 3; j++) {
				System.out.println(i+" "+j);	
			}
			System.out.println("innerloop ended");
			
		}

	}

}
