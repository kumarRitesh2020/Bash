package Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHset {

	public static void main(String[] args) {
	LinkedHashSet<Object>set=new LinkedHashSet<>();
	
	set.add(10);
	set.add(20);
	set.add("hi");
	set.add("hello");
	set.add(null);
	set.add(null);
	

	System.out.println(set);
	System.out.println(set.isEmpty());
	System.out.println(set.remove(20));
	System.out.println(set.size());
	
	if(set.contains("hi")) {
		
		System.out.println("present");
	}
	
	else {
		
		System.out.println("not present");
		
	}
	
	for(Object obj :set) {
		
		System.out.println();
		
		Iterator<Object>i=set.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
			
		}
	}
		
	

}

}


	