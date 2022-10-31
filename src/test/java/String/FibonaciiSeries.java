package String;

public class FibonaciiSeries {
	
	
	public static void main(String[] args) {
		int n=9,firstTerm=0,secondTerm=1;
		System.out.println("fibonacci series till "+n+" ");
		
		for(int i=1;i<n+1;i++) {
			
			System.out.print(firstTerm+" ");
			
		
		int nextTerm=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=nextTerm;

	}

}}



