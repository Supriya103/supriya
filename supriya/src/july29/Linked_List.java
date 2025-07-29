package july29;

import java.util.LinkedList;

public class Linked_List {
     public static void main(String[] args) {
		LinkedList<Integer>l=new LinkedList<Integer>();
		l.add(55);
		l.add(35);
		l.add(120);
		l.add(150);
		
		for(Integer ele:l) {
			System.out.println(ele);
		}
	}
}
