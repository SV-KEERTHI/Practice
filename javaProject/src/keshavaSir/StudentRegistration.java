package keshavaSir;

import java.util.Scanner;

public class StudentRegistration {
	String Sname;
	String email;
	long phno;
	String degree;
	String course;

	public StudentRegistration(String Sname, String email, long phno, String degree, String course) {
		this.Sname = Sname;
		this.email = email;
		this.phno = phno;
		this.degree = degree;
		this.course = course;
	}

	public StudentRegistration(String Sname, long phno, String degree, String course) {
		this.Sname = Sname;
		this.phno = phno;
		this.degree = degree;
		this.course = course;
	}

	public StudentRegistration(String Sname, String email, String degree, String course) {
		this.Sname = Sname;
		this.email = email;
		this.degree = degree;
		this.course = course;
	}

	void updatePhno(long phno) {
		this.phno = phno;
	}

	void updateEmail(String email) {
		this.email = email;
	}

	void StudentDetails() {
		System.out.println("Sname: " + Sname);
		System.out.println("email: " + email);
		System.out.println("phno: " + phno);
		System.out.println("degree: " + degree);
		System.out.println("course: " + course);
		System.out.println("Your values updated successfully...");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StudentRegistration st1 = null;
		StudentRegistration st2 = null;
		StudentRegistration st3 = null;

		while (true) {
			System.out.println("Registration Methods:");
			System.out.println("1. Register with email");
			System.out.println("2. Register with phno");
			System.out.println("3. Register with email and phno");
			System.out.println("4. Update Phno");
			System.out.println("5. Update Email");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int n = s.nextInt();

			switch (n) {
			case 1:
				System.out.print("Sname: ");
				String name = s.next();
				System.out.print("email: ");
				String email = s.next();
				System.out.print("degree: ");
				String degree = s.next();
				System.out.print("course: ");
				String course = s.next();
				st1 = new StudentRegistration(name, email, degree, course);
				st1.StudentDetails();
				break;
			case 2:
				System.out.print("Sname: ");
				String name1 = s.next();
				System.out.print("phno: ");
				long phno = s.nextLong();
				System.out.print("degree: ");
				String degree1 = s.next();
				System.out.print("course: ");
				String course1 = s.next();
				st2 = new StudentRegistration(name1, phno, degree1, course1);
				st2.StudentDetails();
				break;
			case 3:
				System.out.print("Sname: ");
				String name2 = s.next();
				System.out.print("phno: ");
				long phno2 = s.nextLong();
				System.out.print("email: ");
				String email1 = s.next();
				System.out.print("degree: ");
				String degree2 = s.next();
				System.out.print("course: ");
				String course2 = s.next();
				st3 = new StudentRegistration(name2, email1, phno2, degree2, course2);
				st3.StudentDetails();
				break;
			case 4:
				if ( st1 != null) {
					System.out.print("Update Phno: ");
					long newPhno = s.nextLong();
					st1.updatePhno(newPhno);
					st1.StudentDetails();
				} else {
					System.out.println("No registration found. Please register first.");
				}
				break;
			case 5:
				if (st2 != null) {
					System.out.print("Update Email: ");
					String newEmail = s.next();
					st2.updateEmail(newEmail);
					st2.StudentDetails();
				} else {
					System.out.println("No registration found. Please register first.");
				}
				break;
			case 6:
				System.out.println("Exiting...");
				s.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
