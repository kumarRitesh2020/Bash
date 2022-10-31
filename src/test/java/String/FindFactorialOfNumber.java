package String;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		int n=5; //5x4x3x2x1=120
		int fact=1;
		for(int i=1;i<=n;i++) {
			
			fact=fact*i;
			
		}
		System.out.println(fact);
	}

}
