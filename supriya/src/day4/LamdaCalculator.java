package day4;

interface LamdaCalculator1 {
	double add(double a, double b);
}
public class LamdaCalculator {
	public static void main(String[] args) {
		LamdaCalculator1 addition = (a,b) -> {
			System.out.println("Addition");
			double result = a+b;
			System.out.println("result" + result);
			return result;
		};
		LamdaCalculator1 subtract = (a,b) -> a-b ;
	
		
		//Syntax for Lambda expression in is (parameters List) -> Body(Logic)
		
		
		double a = 1000.0, b = 2000.0;
		addition.add(a, b);
		System.out.println("Subtract " + subtract.add(a, b));
	}
}

