package Array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
	 int[] arr= {2,4,1,1,5,4};
	 
	 List<Integer> l=new ArrayList<>();
	 l.add(2);
	 l.add(4);
	 l.add(1);
	 l.add(1);
	 l.add(5);
	 l.add(4);
	 
	 System.out.println(l);
	 
	 List<Integer> newList=new ArrayList<>();
	 for(Integer s:l) {
		 
		 if(!newList.contains(s)) {
			 newList.add(s);
			 
		 }
		 
	 }
	 
	 for(Integer i:newList) {
		 System.out.println(i); //Duplicate remove
	 }
	 
	}

}
