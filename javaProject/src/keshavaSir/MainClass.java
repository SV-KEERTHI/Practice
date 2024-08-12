package keshavaSir;

public class MainClass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("KIKI");
		emp.setSalary(50000.00);
		System.out.println("Id: "+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());

	}

}
