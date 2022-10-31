package Array;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedsett {

	public static void main(String[] args) {
		SortedSet<String> set=new TreeSet<>();
		set.add("Infosys");
		set.add("IBM");
		set.add("WIPRO");
		set.add("GOOGLE");
		set.add("MICROSOFT");
		set.add("COGNIZANT");
		System.out.println(set);
		for(String str : set)
		{
			System.out.println(str);
			
		}
		
		System.out.println();
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("Infosys"));
		System.out.println(set.tailSet("GOOGLE"));
		

	}

}
