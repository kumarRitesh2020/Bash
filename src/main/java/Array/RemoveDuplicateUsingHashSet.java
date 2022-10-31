package Array;

import java.util.HashSet;

public class RemoveDuplicateUsingHashSet {

	public static void main(String[] args) {
		 int[] arr= {2,4,1,1,5,4};
		 
		 HashSet<Integer> hs=new HashSet<>();
		 for(int i=0;i<arr.length;i++) {
			 hs.add(arr[i]);
		 }
		 
		 for(int duplicate :hs) {
			 System.out.println(duplicate);
		 }

	}

}
