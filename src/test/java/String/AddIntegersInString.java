package String;

public class AddIntegersInString {

	public static void main(String[] args) {
		String s="11b21c3"; //35
		
		 int sum=0;
		 int tsum=0;
			
		 for(int i=0;i<s.length();i++) 
		 {
			 if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				 int n=s.charAt(i)-48; //logic value is always 48 //n=49-48=1
				 tsum=tsum*10+n; //tsum=2*10+1=21
			 }else {
				 sum=sum+tsum;//sum=0+11,11+21=32
				 tsum=0;
					 
				 }
			 
				 
			 
		 }
		 
		 sum=sum+tsum;
			System.out.println(sum);
	
	}




	}


