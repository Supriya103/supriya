package day4;

public class Timer {
          
	public static void main(String[] args) {
		String []tasks= {
				"Finish homework",
				"check emails",
				"Read a book",
				"Go for a walk"
		};
		double[] times= {11.00,12.00,01.00,02.00};
		String a="";
		for(int i=0;i<times.length;i++) {
			if(times[i]<10) {
				a="pm";
			}else {
				a="am";
			}
			System.out.println("Now the time is : "+times[i]+""+a);
			System.out.println("Next the task is :"+tasks[i]);
			System.out.println();
		}
	}
}
