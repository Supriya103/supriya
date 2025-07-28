package july28;
class Mul3 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello java");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Mul4 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("this is new program");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadingTwo {
             public static void main(String[] args) {
				Runnable m3=new Mul3();
				Runnable m4=new Mul4();
				
				Thread t1=new Thread(m3);
				Thread t2=new Thread(m4);
				t1.start();
				t2.start();
			}     


		}
	



