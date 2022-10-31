package Array;

public class ThirdMiimum {

	public static void main(String[] args) {
		int[] arr= {4,1,3,2,5};
		int k=3;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			
			if(i==k-1) {
				System.out.println("Third MIN value is===>" +arr[i]);
			}
		}
	}}