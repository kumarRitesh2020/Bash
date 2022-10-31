package String;

import java.util.LinkedHashSet;

public class PrintDuplicateWithCount {

	public static void main(String[] args) {
		

		String str="I love love Bangalore city city";
		String[] s=str.split(" ");
		LinkedHashSet<String>set=new LinkedHashSet<>();
		for(int i=0;i<s.length;i++) {
		
			set.add(s[i]);
			
			
			
		}
		for(String stri :set) {
			int count=0;
			for(int i=0;i<s.length;i++) {
				if(stri.equals(s[i])) {
					count++;
				}
			
		}
			if(count>1) {
				System.out.println(stri+" is repeating "+count+" time");
				
			}
			
		
			
			
		}
		

	}


	

}
