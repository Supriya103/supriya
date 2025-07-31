package july31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections_sort {
	public static void main(String[] args) {
		
		ArrayList<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("web technology");
		courses.add("sql");
		courses.add("sql");
		for(String c : courses)
		{
		System.out.println(c);
		}
		Set <Integer> Courses = new HashSet<>();
		Courses.add(101);
		Courses.add(102);
		Courses.add(101);
		Courses.add(104);
		for(Integer j : Courses)
		{
			System.out.println(j);
		}
		Map<String, Integer> courseduration = new HashMap<>();
		courseduration.put("java", 101);
		courseduration.put("web technology", 102);
		courseduration.put("sql", 101);
		courseduration.put("java", 104);
		courseduration.put("sql", 105);
		for(String c :courseduration.keySet()) {
			System.out.println(c + "=" + courseduration.get(c));
					
		}
		
	}
}






