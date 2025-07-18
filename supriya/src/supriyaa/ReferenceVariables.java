package supriyaa;


	public class ReferenceVariables{
    	public static void changeName(Person p) {
    		p.name="changed";
    	}
    	public static void main(String[]args) {
    		int x=10;
    		int z=x;
    		z=20;
    		System.out.println("x is:"+x);
    		System.out.println("z is:"+z);
    		Person p1=new Person("xyz");
    		Person p2=p1;
    		p2.name="abc";
    		System.out.println("p1 is"+p1);
    		changeName(p1);
    		System.out.println("p1 after changeName="+p1);
    	}
	}


	
