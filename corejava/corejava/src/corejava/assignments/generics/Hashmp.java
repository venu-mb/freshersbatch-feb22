package corejava.assignments.generics;

import java.util.HashMap;

public class Hashmp {

	public static void main(String[] args) {

		HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
		hm.put((int) (Math.random() * 100), Math.random());
		hm.put((int) (Math.random() * 100), Math.random());
		hm.put((int) (Math.random() * 100), Math.random());
		hm.put((int) (Math.random() * 100), Math.random());
		hm.put((int) (Math.random() * 100), Math.random());
		hm.put((int) (Math.random() * 100), Math.random());
		hm.put((int) (Math.random() * 100), Math.random());
		hm.put((int) (Math.random() * 100), Math.random());
		hm.put((int) (Math.random() * 100), Math.random());
		hm.put((int) (Math.random() * 100), Math.random());
		for (java.util.Map.Entry<Integer, Double> i : hm.entrySet())
			System.out.println(i);

	}

}
