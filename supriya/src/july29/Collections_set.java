package july29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_set {
        public static void main(String[] args) {
			Set<Integer>setData=new HashSet<Integer>();
			setData.add(115);
			setData.add(95);
			setData.add(11);
			setData.add(12);
			//setData.add("hello");
			//setData.add("hello");
			System.out.println(setData);
			Iterator<Integer>iterator=setData.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
}
