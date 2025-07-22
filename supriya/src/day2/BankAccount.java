package day2;

public class BankAccount {
             String accountHolder;
             double balance;
            
            public BankAccount(String accountHolder,double balance) {
            	this.accountHolder=accountHolder;
            	this.balance=balance;
            }
            public void deposit(double amount) {
            	balance+=amount;
            	System.out.println(amount+"deposited.New Balance: "+balance);
            }
            
            public void withdraw(double amount) {
            	if(amount>balance) {
            		System.out.println("Insufficient balance");
            	}
            	else {
            		balance=balance-amount;
            		System.out.println(amount +"withdrawn. Remaining Balance: "+balance);
            	}
            }
            
            public void displayDetails() {
            	System.out.println("AccountHolder: "+accountHolder);
            	System.out.println("Balance: "+balance);
            }
}
