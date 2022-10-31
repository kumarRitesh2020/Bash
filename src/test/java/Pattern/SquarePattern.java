package Pattern;
//*****
//*****
//*****
//*****
//*****

public class SquarePattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			//i=1 1<5 true
			//i=2 2<5 true
			//i=3 3<5 true
			//i=4 4<5 true
			//i=5 5<5 true
			//i=6 6<5 false
			for(int j=1;j<=n;j++) {
				
				//j=1 1<=5
				//j=2 2<=5
				//j=3 3<=5
				//j=4 4<=5
				//j=5 5<=5
				//j=6 6<=5 false
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
