package day2;

abstract class FullTimeEmployee extends Employer {
             double monthlySalary;
             
             public FullTimeEmployee(String name,int empId,double monthlySalary) {
            	 super(name,empId);
            	 this.monthlySalary=monthlySalary;
             }
             @Override
             double calculateSalary() {
            	 return monthlySalary;
             }
}
