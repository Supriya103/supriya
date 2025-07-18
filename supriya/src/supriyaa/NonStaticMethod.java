package supriyaa;

public class NonStaticMethod {
            public static void main(String[] args) {
				Program10 p1=new Program10();
				Program10 p2=new Program10();
				p1.increment();
				p2.increment();
				p2.increment();
				System.out.println(p1.getCount());
				System.out.println(p2.getCount());
			}
}
