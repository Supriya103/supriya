package day4;
import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
	
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("supriya");
		a.add("sathwik");
		a.add("sarala");
		a.add("bhushan");
		a.add("mounika");
		a.add("gayatri");
		
		
		System.out.println("ArrayList before sorting is : " + a);
	 
		Collections.sort(a);
		
		System.out.println("ArrayList after sorting is : " + a);
	}
	}


