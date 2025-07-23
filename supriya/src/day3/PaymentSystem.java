package day3;

interface ecommercePayment {
       void makePayment();
}
abstract class PaymentSystems implements ecommercePayment{
	double amount;
	PaymentSystems(double amount){
		this.amount=amount;
	}
	void showSuccessMessage()
	{
		System.out.println("Payment is successful "+amount);
	}
}
class DebitCardPayment extends PaymentSystems{
	DebitCardPayment(double amount){
		super(amount);
	}
	public void makePayment()
	{
		System.out.println("Debit card payment is done...");
		showSuccessMessage();
	}
}
class NetBankingPayment extends PaymentSystems{
	NetBankingPayment(double amount){
		super(amount);
}
	public void makePayment()
	{
		System.out.println("Net Banking payment is done...");
		showSuccessMessage();
	}
}

public class PaymentSystem{
	 public static void main(String[] args) {
		PaymentSystems ep1=new DebitCardPayment(45000);
		ep1.makePayment();
		
		System.out.println();
		PaymentSystems ep2=new NetBankingPayment(25000);
		ep2.makePayment();
	}
}
