package Assignment;

import java.util.LinkedHashSet;

public class PrintDuplicateWithCount {

	public static void main(String[] args) {
		
		int[] arr= {4,3,2,3,1};
		LinkedHashSet<Integer>set=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
		
			set.add(arr[i]);
			
			
			
		}
		for(Integer stri :set) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(stri.equals(arr[i])) {
					count++;
				}
			
		}
			if(count>1) {
				System.out.println(stri+" is repeating "+count+" time");
				
			}
			
		
			
			
		}
		

	}


	

}
