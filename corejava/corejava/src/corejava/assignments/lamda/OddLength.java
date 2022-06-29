package corejava.assignments.lamda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class OddLength {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Venuprasad");//true
		a.add("Rakshath");
		a.add("Venu");
		a.add("raks");
		

			
		Predicate<String> length = l -> l.length() % 2 != 0;
		a.removeIf(length);

		System.out.println(a);
		
		
		
	}

}
