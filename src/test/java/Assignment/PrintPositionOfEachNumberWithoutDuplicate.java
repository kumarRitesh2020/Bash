package Assignment;

import java.util.LinkedHashSet;

public class PrintPositionOfEachNumberWithoutDuplicate {

	public static void main(String[] args) {
		int[] arr= {4,3,2,3,1};
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>(); //used for removing duplicate and maintain order of insertion.
		for(int i=0;i<arr.length;i++) 
		{
			set.add(arr[i]);
			
			
		}
		for(Integer ch :set) {
			
		//	for(int i=0;i<s.length();i++) { //for printing position with removing last duplicate
				for(int i=arr.length-1;i>0;i--) { //for printing position with removing first duplicate
				if(ch==arr[i]) {
					
				System.out.println(ch+" "+(i+1));
				break;
			}
		

	}

		}





	}

}
