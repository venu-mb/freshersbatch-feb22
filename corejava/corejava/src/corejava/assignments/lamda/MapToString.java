package corejava.assignments.lamda;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MapToString {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Venu");
		hm.put(2, "Venu");
		hm.put(3, "Venu");
		hm.put(4, "Venu");



		hm.entrySet().forEach(k -> s.append(k));
		System.out.println(s);

		StringTokenizer st = new StringTokenizer(s.toString(), "=");
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}


	}

}
