package String;

public class ReverseWords {

	public static void main(String[] args) {
		String st="I love Bangalore city";//output--> Bangalore love I
		String[] s=st.split(" ");
		for(int i=s.length-1;i>=0;i--) {
		//	System.out.print(s[i]);
			System.out.print(s[i]+" "); //remove space
			
		}

	}

}
