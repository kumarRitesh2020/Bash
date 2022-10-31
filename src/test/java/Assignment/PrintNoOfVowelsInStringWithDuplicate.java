package Assignment;

public class PrintNoOfVowelsInStringWithDuplicate {

	public static void main(String[] args) {
		
		String str="india";
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			//i=0 ;0<str     s[i]=i
			//i=1 ;1<str     s[i]=n
			//i=2 ;2<str     s[i]=d
			//i=3 ;3<str     s[i]=i
			//i=4 ;4<str     s[i]=a
			//i=5 ;5<str    terminate
			
			
			
			
			
			
			
			
			if(ch[i]=='a' || ch[i]=='i'||ch[i]=='o'||ch[i]=='e'||ch[i]=='u') {
				count++;
				System.out.println(ch[i]+" ");
				
			}}
		
		
			System.out.println(count);
		}
	}
	

	


	


