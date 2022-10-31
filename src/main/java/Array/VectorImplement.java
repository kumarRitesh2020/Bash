package Array;

import java.util.Vector;

public class VectorImplement {
	
	
	public static void main(String[] args) {
		Vector<Object> vec=new Vector<Object>();
		vec.add(20);
		vec.add(40);
		vec.add(10);
		vec.add("hi");
		vec.add(null);
		vec.add(null);
		System.out.println(vec);
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		System.out.println(vec.indexOf("hi"));
		vec.add(4,"hello");
		System.out.println(vec);

	}

}



