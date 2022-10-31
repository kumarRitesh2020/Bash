package Array;

public class AdditionArray {

	public static void main(String[] args) {
		int[] a= {2,3,1,5,2};
		int[] b= {1,4,3,2,2,5};
		
		int length=a.length;
		if(a.length<b.length) {
			length=b.length;
		}
		
		for(int i=0;i<length;i++) {
			try {
				
				
				System.out.println(a[i]+b[i]);
				
			} catch (Exception e) {
				
				if(a.length<b.length)
				{
					System.out.println(b[i]);
				}
				
				else {
					System.out.println(a[i]);
				}
				
			}
			
			
		}
		
	}

}
