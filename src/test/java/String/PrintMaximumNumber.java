package String;

public class PrintMaximumNumber {

	public static void main(String[] args) {
		int [] s= {1325553,12545,1234,123,12};
		Integer maxlength=s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i]>maxlength) {
				maxlength=s[i];
			
				
			}
		}
		for(int i=0;i<s.length;i++) {
			if(s[i]==maxlength) {
				System.out.println(s[i]);
			}
		}
	}

	}


