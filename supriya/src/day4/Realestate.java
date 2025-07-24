package day4;

abstract class Realestate {
       abstract void home();
       abstract void apartment();
       
}
class Varadhi extends Realestate{
	void home() {
		int food=1000;
		double rent=15000.0;
		int expenses=2000;
		double total=(double)(food+rent+expenses);
		System.out.println("Total cost of Varadhi home "+total);
	}

	@Override
	void apartment() {
		int food=1500;
		double rent=10000.0;
		int expenses=1000;
		double total=(double)(food+rent+expenses);
		System.out.println("Total cost of Varadhi apartment "+total);
	}
		
	
}
