package day3;

abstract class Payments {
       double amount;
       Payments(double amount){
    	   this.amount=amount ;  
    	   }
       abstract void makePayment();
       void showSuccessMessage()
       {
    	   System.out.println("Payment successful "+amount);
       }
       
}
class CreditCardPayment extends Payments
{
	CreditCardPayment(double amount){
		super(amount);
	}
	void makePayment()
	{
		System.out.println("CreditCardPayment is done...");
	}
}

class UpiPayment extends Payments
{
	UpiPayment(double amount){
		super(amount);
	}
	void makePayment()
	{
		System.out.println("UpiPayment is done...");
	}
}

public class Payment{
	public static void main(String[] args) {
		Payments py1=new CreditCardPayment(30000);
		py1.makePayment();
		System.out.println("Credit card payment process is completed");
		
		Payments py2=new UpiPayment(35000);
		py2.makePayment();
		System.out.println("Upi payment process is completed");
	}
}
