package Array;

public class swapArrayAscendingOrder {

	public static void main(String[] args) {
		int[] arr= {8,3,4,32,2,4,5};
		
		for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
		if(arr[i]<arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
			
		}
		}
		for(int i=0;i<arr.length;i++) { //for printing output we are using for loop here
			System.out.println(arr[i]+" ");

	}}
}
