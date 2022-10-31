package Array;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmapp {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hello");
		map.put(10, "hello");
		map.put(5, "bye");
		map.put(3, "hello");
		map.put(null, "abc");
		map.put(null, "abcd");
		map.put(4, null);
		map.put(1, null);
		
		System.out.println(map);
		System.out.println(map.remove(20));
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.replace(5, "super"));
		System.out.println(map.get(10));
		System.out.println(map);
		
		for(Entry<Integer,String> m :map.entrySet()) 
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
