package day2;

public class BankMainMethod {
   public static void main(String[] args) {
	BankAccount b=new BankAccount("Sathwik",1000);
	b.deposit(5000);
	b.withdraw(2500);
	b.displayDetails();
}
}
