package corejava.assignments.generics;

import java.util.ArrayList;

public class Swap {

	static void swap(int[] k, int j, int l) {

		int t = k[j];
		k[j] = k[l];
		k[l] = t;
		for (int i = 0; i < k.length; i++)
			System.out.print(k[i]);
		System.out.println();

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
//    ArrayList<Integer> al = new ArrayList<Integer>();
//    for(int i=0;i<a.length;i++)
//    {
//        al.add(a[i]);
//    }
		swap(a, 0, 2);
		swap(a, 0, 2);
		swap(a, 0, 2);
		swap(a, 0, 2);

	}

}