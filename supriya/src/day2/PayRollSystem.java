package day2;

public class PayRollSystem {
       public static void main(String[] args) {
		Employer e1=new FullTimeEmployee("Abhi",101,50000);
		Employer e2=new PartTimeEmployee("Durga",102,80,300);
		e1.display();
		System.out.println("Salary: "+e1.calculateSalary());
		System.out.println();
		e2.display();
		System.out.println("Salary: "+e2.calculateSalary());
	}
}
