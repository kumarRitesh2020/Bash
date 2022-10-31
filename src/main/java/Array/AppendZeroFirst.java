package Array;

public class AppendZeroFirst {

	public static void main(String[] args) {
		int[] arr= {2,0,1,3,0,0};
		int[] temp=new int[arr.length];
		int m=0;
		int n=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				temp[m]=0;
				m++;
			}
			else if(arr[i]!=0) {
				temp[n]=3;
				n--;
			}
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]+" ");
		}

	}}