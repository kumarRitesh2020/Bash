package String;

public class StringMethods {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println(s.length());
		
		String st="welcome";
		char[] s1=st.toCharArray();
		System.out.println(s1.length);
		
		
		String s2="welcome";
		System.out.println(s2.indexOf('e'));
		
		String s3="hi";
		String s4="hello";
		String s5="welcome";
		String s6="hi";
		System.out.println(s3.concat(s4).concat(s5));
		
		
		String s7="hi";
		String s8="hello";
		String s9="welcome";
		String joined=String.join(" ", s7,s8,s9);
		System.out.println(joined);
		
		
		String s10="welcome";
		System.out.println(s10.contains("lc"));
		
		
		String s11="welcome";
		System.out.println(s11.startsWith("we"));
		
		String s12="welcome";
		System.out.println(s12.endsWith("me"));
		
		String s13="welcome";
		String s14="";
		System.out.println(s14.isEmpty());
		
		String s15="hi hello welcome";
		System.out.println(s15.trim());
		
		String s16="welcome";
		System.out.println(s16.substring(0,3));
		
		String s17="hi hello welcome";
		String[] s18=s17.split(" ");
		for(int i=0;i<s18.length;i++) {
			System.out.println(s18[i]);
		}
		
		String s19="hi";
		String s20="hello";
		System.out.println(s19.equals(s20));
		
		String s21="hi hello welcome";
		System.out.println(s21.replace(" ", " "));
		
		
		String s22="WELCOME";
		System.out.println(s22.toLowerCase());
		
		String s23="welcome";
		System.out.println(s23.toUpperCase());
		
		
		

	}

}
