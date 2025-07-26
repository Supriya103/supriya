package day6;

import java.util.Scanner;

public class Factorial_Exception {
            public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				try {
					System.out.println("Enter a number: ");
					int n=sc.nextInt();
					
					if(n<0) {
						System.out.println("Factorial is not defined for negative numbers");
					}
					else {
						int fact=1;
						for(int i=1;i<=n;i++) {
							fact=fact*i;
						}
						System.out.println("Factorial of "+n+ " is: "+fact);
					}
				}
				catch(Exception e) {
					System.out.println("Please enter a valid number.");
				}
				finally {
					sc.close();
					System.out.println("Program ended");
				}
			}
}
