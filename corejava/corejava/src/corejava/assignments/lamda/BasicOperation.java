package corejava.assignments.lamda;

import java.util.Scanner;

@FunctionalInterface
interface Operations {
	public double BasicOperat(double a, double b);

}

public class BasicOperation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1");
		double n1 = sc.nextDouble();
		System.out.println("Enter n2");
		double n2 = sc.nextDouble();
		System.out.println("a) for Addition b) for Subtraction c) for Multiplication d) for Division");
		String s = sc.next();

		if (s.equalsIgnoreCase("a")) {
			System.out.println("Addition");
			Operations s5 = (a, b) -> a + b;
			System.out.println(s5.BasicOperat(n1, n2));
		}
		if (s.equalsIgnoreCase("b")) {
			System.out.println("Subtraction");
			Operations s1 = (a, b) -> a - b;
			System.out.println(s1.BasicOperat(n1, n2));
		}
		if (s.equalsIgnoreCase("c")) {
			System.out.println("Multiplication");
			Operations s2 = (a, b) -> a * b;
			System.out.println(s2.BasicOperat(n1, n2));
		}
		if (s.equalsIgnoreCase("d")) {
			System.out.println("Division");
			Operations s3 = (a, b) -> a / b;
			System.out.println(s3.BasicOperat(n1, n2));
		}

	}

}
