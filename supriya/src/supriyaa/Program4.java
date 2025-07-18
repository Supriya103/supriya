package supriyaa;

public class Program4 {
         public static void main(String[] args) {
			if(args.length<2) {
				System.out.println("please provide two numbers");
				
			}
			try {
				int a=Integer.parseInt(args[0]);
				int b=Integer.parseInt(args[1]);
				System.out.println("Sum is:"+(a+b));
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid integer input:"+e.getMessage());
			}
		}
}
