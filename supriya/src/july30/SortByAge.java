package july30;

import java.util.Comparator;


public class SortByAge implements Comparator<Employee>{
       
@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.age-o2.age;
		}
}
