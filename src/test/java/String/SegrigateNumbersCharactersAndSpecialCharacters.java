package String;

public class SegrigateNumbersCharactersAndSpecialCharacters {

	public static void main(String[] args) {
		 String st="a$#1sv%2";
		 String alpha=" ";
		 String num=" ";
		 String special=" ";
		
		 for(int i=0;i<st.length();i++) 
		 {
			 if(st.charAt(i)>='A' && st.charAt(i)<='Z'||st.charAt(i)>='a' && st.charAt(i)<='z') {
				 alpha=alpha+st.charAt(i);
			 }else if(st.charAt(i)>='0' && st.charAt(i)<='9') {
				 num=num+st.charAt(i);
			 }else {
				 special=special+st.charAt(i);
			 }
		 }
			System.out.println(alpha+num+special);
	}}
			 
		 