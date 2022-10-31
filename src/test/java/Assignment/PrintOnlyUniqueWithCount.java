package Assignment;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueWithCount {

	public static void main(String[] args) {
		int[]arr= {4,3,2,3,1};
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>(); //used for removing duplicate and maintain order of insertion.
		for(int i=0;i<arr.length;i++) 
		{
			set.add(arr[i]);
			
			
		}
		for(Integer ch :set) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(ch==arr[i]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(ch+" "+count);
			}
		

	}

		}





	}

