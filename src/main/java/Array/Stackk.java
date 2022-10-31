package Array;

import java.util.Stack;

public class Stackk {
	
	
	public static void main(String[] args) {
		Stack<Object> st=new Stack<Object>(); //LIFO
		st.push(20);
		st.push(10); //last in
		System.out.println(st.pop()); //10 // FIRST OUT
		System.out.println(st.pop());//20

	}

}
