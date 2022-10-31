package RiteshAutomation.First;

import java.util.Scanner;

public class SumOfDigitWithoutLoop {

	public static int Sumofdigits(int num) {
		
		if(num==0)
			return 0;
		return (num%10+Sumofdigits(num/10));
		
		
}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int result=Sumofdigits(num);
		System.out.println("Sum of digit is 5"+result);
	}

}
