package keshavaSir;

public class FinalKeyword {
    static int start_id = 1001;
    final int id;
    String name;
    double sal;
    String job;
    int exp;

    FinalKeyword(String name, double sal, String job, int exp) {
        this.id = start_id++;
        this.name = name;
        this.sal = sal;
        this.job = job;
        this.exp = exp;
    }

    void employeeDetails() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(sal);
        System.out.println(job);
        System.out.println(exp);
    }

    public static void main(String[] args) {
        FinalKeyword e1 = new FinalKeyword("kiki", 1000.0, "ASE", 2);
        FinalKeyword e2 = new FinalKeyword("miki", 2000.0, "SSE", 3);
        FinalKeyword e3 = new FinalKeyword("riki", 3000.0, "TL", 5);
        
        e1.employeeDetails();
        System.out.println("----------------------");
        e2.employeeDetails();
        System.out.println("----------------------");
        e3.employeeDetails();
    }
}
