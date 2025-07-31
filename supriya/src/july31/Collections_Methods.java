package july31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Methods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a =new ArrayList<>(Arrays.asList(50,30,60,10));
		a.add(75);
		a.add(80);
		System.out.println(a);
		Collections.sort(a);
		System.out.println("sorted:"+a);
		int  b =Collections.binarySearch(a,50);
		System.out.println("Index of 50 in sorted list: "+b);
		Collections.reverse(a);
		System.out.println("reversed:"+a);
		Collections.shuffle(a);
		System.out.println("shuffled:"+a);
	}

}
