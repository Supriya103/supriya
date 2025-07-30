package july30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Student1{
	private int rollno;
	private String name;
	
	public Student1(int rollno,String name) {
		super();
		this.rollno=rollno;
		this.name=name;
	}
	public Student1() {
		
	}
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class SerializationExample {
             public static void main(String[] args)throws IOException {
				Student1 s=new Student1();
				s.setRollno(10);
				s.setName("Supriya");
				
				try {
					FileOutputStream out=new FileOutputStream("C:\\Users\\USER\\Downloads\\hello.txt") ;
					ObjectOutputStream output=new ObjectOutputStream(out);
					output.writeObject(s);
					
					System.out.println("Serialized data saved in file");
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
}
