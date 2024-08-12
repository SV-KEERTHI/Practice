package keshavaSir;

public class Runner {

	public static void main(String[] args) {
		ProductDetails p1 = new ProductDetails();
		p1.setPid(101);
		p1.setName("laptop");
		p1.setPrice(37000.00);
		System.out.println("Product Id: "+p1.getPid());
		System.out.println("Product Name: "+p1.getName());
		System.out.println("Product Price: "+p1.getPrice());

	}

}
