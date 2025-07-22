package day2;

abstract class Employer {
        String name;
        int empId;
        
        public Employer( String name,int empId) {
        	this.name=name;
        	this.empId=empId;
        }
        abstract double calculateSalary();
        	
        public void display() {
        	System.out.println("Employee Id: "+empId);
        	System.out.println("Employee name: "+name);
        }


		
		
}


