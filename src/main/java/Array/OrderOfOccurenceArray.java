package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OrderOfOccurenceArray {

	public static void main(String[] args) {
		 int[] arr= {2,4,1,1,5,4};
		
		 
	
		Map<Integer,Integer> hs=new HashMap<Integer,Integer>();
		 for(int i=0;i<arr.length;i++)
		 {

		 if(hs.containsKey(arr[i]))
		 {
			 hs.put(arr[i], arr[i]+1);
			 
		 }
		 else {
			 hs.put(arr[i], 1);
		 }

		 }
	
		 for(Map.Entry<Integer, Integer> entry:hs.entrySet()){
			 System.out.println(entry.getKey()+"   "+entry.getValue());
		 
}}}