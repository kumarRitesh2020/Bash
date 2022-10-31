package String;

public class AdditionOfNumbersOnly {

	public static void main(String[] args) {
		String st="b7c3d1";
		 int sum=0;
	
		 for(int i=0;i<st.length();i++) 
		 {
			 if(st.charAt(i)>='0' && st.charAt(i)<='9') {
				 int n=st.charAt(i)-48;
				 sum=sum+n;
			 
				 
			 }
		 }
			System.out.println(sum);
	
	}

}
