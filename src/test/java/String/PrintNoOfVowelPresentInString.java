package String;

public class PrintNoOfVowelPresentInString {

	public static void main(String[] args) {
		String str="aeiou";
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='i'||ch[i]=='o'||ch[i]=='e'||ch[i]=='u') {
				count++;
				
			}}
			
			System.out.println(count);
		}

	}


