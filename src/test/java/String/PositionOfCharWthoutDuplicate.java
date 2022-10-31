package String;

import java.util.LinkedHashSet;

public class PositionOfCharWthoutDuplicate {
	
	public static void main(String[] args) {
		
		String s="tester";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>(); //used for removing duplicate and maintain order of insertion.
		for(int i=0;i<s.length();i++) 
		{
			set.add(s.charAt(i));
			
			
		}
		for(Character ch :set) {
			
			for(int i=0;i<s.length();i++) { //for printing position with removing last duplicate
				
				if(ch==s.charAt(i)) {
					
				System.out.println(ch+" "+(i+1));
				break;
			}
		

	}

		}}}



