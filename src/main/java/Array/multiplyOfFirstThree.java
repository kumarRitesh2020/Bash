package Array;

public class multiplyOfFirstThree {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
				
				for(int i=0;i<arr.length;i++) {
				for(int j=i;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
					
				}
				}
				int mul=1;
				for(int i=0;i<3;i++) {
					mul=mul*arr[i];
				}
				System.out.println(mul);

			}

		}
