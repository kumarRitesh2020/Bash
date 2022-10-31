package Array;

public class firstMaxWithoutSorting {

	public static void main(String[] args) {
		int[] arr= {10,2,8,4,20};
		int fmax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fmax) {
				fmax=arr[i];
			}
		}
		
System.out.println("First MAX value "+fmax);
	}

}
