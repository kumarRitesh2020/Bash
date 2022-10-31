package String;

public class Palindrome {

	public static void main(String[] args) {
		String s="mom";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("This is Palydrome");
		}
		else {
			System.out.println("This is not Palyndrome");
		}

	}

}
