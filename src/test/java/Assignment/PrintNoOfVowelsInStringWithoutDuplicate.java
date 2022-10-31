package Assignment;

import java.util.LinkedHashSet;

public class PrintNoOfVowelsInStringWithoutDuplicate {

	public static void main(String[] args) {
		String str="india";
		char[] ch=str.toCharArray();
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++) {
			//i=0 ;0<str     s[i]=i
			//i=1 ;1<str     s[i]=n
			//i=2 ;2<str     s[i]=d
			//i=3 ;3<str     s[i]=i
			//i=4 ;4<str     s[i]=a
			//i=5 ;5<str    terminate
			
			
			set.add(ch[i]);
		}
		int count=0;
			
		for(Character s:set) 
		{
			
			if(s=='a' || s=='i'||s=='o'||s=='e'||s=='u')
			{
				count++;
				System.out.print(s);
				
			}}
		
		
			System.out.print("="+count);
		}
	}
	

	


	



	
		

	