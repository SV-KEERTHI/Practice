package keshavaSir;

import java.util.Scanner;

public class StudentAcc{
	String Sname;
	String degree;
	String email;
	 long phno;
	public StudentAcc(String Sname,String email,String degree) {
		this.Sname = Sname;
		this.email = email;
		this.degree = degree;

	}
	public StudentAcc(String Sname,long phno,String degree) {
		this.Sname = Sname;
        this.phno= this.phno; 
        this.degree = degree;

	}
	
	void StudentDetails() {
		System.out.println(this.Sname);
		System.out.println(this.email);
		System.out.println(this.phno);
		System.out.println(this.degree);
		System.out.println("Your Account has been created. Happy learning..!!");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("Your options...");
			System.out.println("1.Register With Phnoe Number\n2.Register with Email Id\n3.exit");
			System.out.println("Enter Your Coice: ");
			int op = s.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter your Name: ");
				String s1 = s.next();
				System.out.println("Enter your phno: ");
				long p1 = s.nextLong();
				System.out.println("Enter your degree: ");
				String d1 = s.next();
				StudentAcc st1 = new StudentAcc(s1,p1,d1);
				st1.StudentDetails();
				break;
			case 2:
				System.out.println("Enter your Name: ");
				String s2 = s.next();
				System.out.println("Enter your Email: ");
				String e1 = s.next();
				System.out.println("Enter your degree: ");
				String d2 = s.next();
				StudentAcc st2 = new StudentAcc(s2,e1,d2);
				st2.StudentDetails();
				break;
			case 3:
				System.out.println("Exicting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice...!!!");
				break;
			}
		}


	}

}
