package day2;

public abstract class PartTimeEmployee extends Employer {
        int hoursWorked;
        double ratePerHour;
        
        public PartTimeEmployee(String name,int empId,int hoursWorked,double ratePerHour) {
        	super(name,empId);
        		this.hoursWorked=hoursWorked;
        		this.ratePerHour=ratePerHour;
        	
        }
        @Override
        double calculateSalary() {
        	return hoursWorked*ratePerHour;
        }
}
