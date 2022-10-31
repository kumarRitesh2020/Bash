package Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		Set<Object> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add("hi");
		set.add("hello");
		set.add(null);
		set.add(null);
		set.add('A');
		set.add(10);
		set.add("hi");
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
