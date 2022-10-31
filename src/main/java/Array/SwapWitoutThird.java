package Array;

public class SwapWitoutThird {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swap ===>A value = "+a+" & B value ="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap ===>A value = "+a+" & B value ="+b);

	}

}

