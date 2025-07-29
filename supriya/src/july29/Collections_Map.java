package july29;

import java.util.HashMap;

public class Collections_Map {
            public static void main(String[] args) {
				HashMap<String,Integer>map=new HashMap<String,Integer>();
				map.put("Apple",10);
				map.put("Orange",20);
				map.put("Banana",30);
				map.put("Mango",40);
				
				System.out.println(map.keySet());
				System.out.println(map.values());
				for(String key:map.keySet()) {
					System.out.println(key+" = "+map.get(key));
				}
			}
}
