package Array;

import java.util.LinkedList;

public class LinkedListt {
	
	public static void main(String[] args) {
		LinkedList<Object> list= new LinkedList<Object>();
		list.add(10);
		list.add("hi");
		list.add(null);
		list.add(10);
		list.addFirst("bye");
		list.addLast("30");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(1));
		System.out.println(list.removeFirst());
		System.out.println(list.remove(3));
		System.out.println(list.removeLast());
		LinkedList<Object> list2=new LinkedList<Object>();
		list2.add(20);
		list2.add("hi");
		list2.add(10);
		list2.add(0);
		list2.add(5);
		list.retainAll(list2);
		System.out.println(list);
		list.removeAll(list2);
		System.out.println(list);
		list.addAll(list2);
		for(Object obj :list)
		{
			System.out.println(obj);
		}
		

	}


}
