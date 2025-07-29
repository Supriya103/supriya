package july29;

import java.util.ArrayList;
import java.util.List;

public class Collections {
      public static void main(String[] args) {
		List<Integer>data=new ArrayList<Integer>();
		data.add(14);
		data.add(17);
		data.add(7);
		data.add(13);
		data.add(11);
		System.out.println("value of index is: "+data.get(3));
		System.out.println("Index of the value is: "+data.indexOf(7));
		
		for(Object ele:data) {
			int data1=(Integer)ele;
			System.out.println(data1);
		}
	}
}
