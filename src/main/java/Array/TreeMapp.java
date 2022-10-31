package Array;

import java.util.TreeMap;

public class TreeMapp {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hello");
		map.put(10, "hello");
		map.put(5, "bye");
		map.put(3, "hello");
		// map.put(null, "abc"); not allowed
		map.put(4, null); // allowed
		map.put(2, null); // allowed
		
		System.out.println(map);
		
		//RED BLACK TREE
		

	}

}
