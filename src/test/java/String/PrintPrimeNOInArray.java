package String;

public class PrintPrimeNOInArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		for(int i=1;i<a.length;i++) { //i=4,4<9t
			int n=a[i];//n=5
			int j=2;//j=2,3,4,5
			while(j<=n)//2<=5t
			{
				if(n%j==0) { //5%5==0
					break;
				}else {
					j++;
				}
			}
			if(j==n) { //2==2 3==3 5==5
				System.out.println(n);
			}
	}}}
	
