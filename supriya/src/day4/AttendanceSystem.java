package day4;
import java.util.*;
interface Attendance {
	void mark(String studentname,String status);
	void showAttendance();
}

public class AttendanceSystem implements Attendance{
	ArrayList<String> names=new ArrayList<>();
	ArrayList<String> statuses=new ArrayList<>();
	
	public void mark(String studentname,String status) {
		names.add(studentname);
		statuses.add(status);
	}

	@Override
	public void showAttendance() {
		System.out.println("Attendance Record:");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i)+"_"+statuses.get(i));
		}
	}
	//main method
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		AttendanceSystem a=new AttendanceSystem();
		while(true) {
			System.out.println("Enter student name or 'done' to finish:");
			String name=scanner.nextLine();
			if(name.equalsIgnoreCase("done")) {
				break;
			}
			System.out.println("Enter status(Present/Absent): ");
			String status=scanner.nextLine();
			a.mark(name,status);
		}
		a.showAttendance();
	}
}
