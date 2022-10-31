package Array;

public class SecondMin {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int fmin=arr[0];
		int smin=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=fmin) {
				if(arr[i]!=fmin) {
					smin=fmin;
				}
				
				fmin=arr[i];
			}
			
			else if(fmin==smin || arr[i]<smin) {
				smin=arr[i];
				
			}
			
		}
		
		System.out.println("First MIN value ==> "+fmin);
		System.out.println("Second MIN value ==> "+smin);

	}

}

