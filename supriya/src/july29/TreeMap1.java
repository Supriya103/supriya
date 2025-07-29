package july29;


import java.util.TreeMap;

public class TreeMap1 {
          public static void main(String[] args) {
	
        	  TreeMap<String,Integer>map=new TreeMap<String,Integer>();
				map.put("Monty",1);
				map.put("Pavan",2);
				map.put("Rahul",3);
				map.put("Harsha",4);
				
				System.out.println(map.keySet());
				System.out.println(map.values());
				for(String key:map.keySet()) {
					System.out.println(key+" = "+map.get(key));
				}
			}


		}

