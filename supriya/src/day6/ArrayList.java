package day6;

public class ArrayList {
             public static void main(String[] args) {
				int[] num= {10,20,30,40,50,60};
				int indexToFetch=5;
				try {
					System.out.println("Trying to access the index"+ indexToFetch+ "...");
					int val=num[indexToFetch];
					System.out.println("Value: "+val);
				}
				catch(Exception e){
					System.out.println("caught exception: "+e);
					System.out.println("Valid indices are 0 to "+(num.length-1));
				}
				finally {
					System.out.println("Finally block executed...");
				}
				System.out.println("Program continues..");
			}
}
