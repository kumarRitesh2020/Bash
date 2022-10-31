package String;

public class ReverseString {

	public static void main(String[] args) 
	{
//		String s="welcome"; //METHOD 1
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
		
		
//		String st="welcome"; //METHOD 2
//		char[] s=st.toCharArray();
//		for(int i=s.length-1;i>=0;i--) {
//			System.out.print(s[i]);
//		}

		
//		String s="welcome"; //METHOD 3
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//		
//		System.out.println(rev);
		
		
		
//		String st="welcome"; //METHOD 4
//		char[] s=st.toCharArray();
//		int count=0;
//		for(char c: s) {
//			count++;
//			
//		}
//		for(int i=count-1;1>=0;i--) {
//			System.out.println(s[i]); 
//		}
		
		String s="welcome"; //METHOD 5
		StringBuffer sb= new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
