package supriyaa;

public class Program3{
          public int add(int a,int b)
          {
        	  return a+b;
          }
          public static void main(String[]args) {
        	  Program3 prog=new Program3();
        	  int sum=prog.add(5, 6);
        	  System.out.println("Sum is:"+sum);
          }
}
