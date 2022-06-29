package corejava.assignments.lamda;

import java.util.ArrayList;

@FunctionalInterface
interface Price {
	double greater(double a, double b);
}

@FunctionalInterface
interface Status {
	String status(String a, String b, String c);
}

public class Orders {
	private double price;
	private String status;

	public Orders() {
		super();

	}

	public Orders(double price, String status) {
		super();
		this.price = price;
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [price=" + price + ", status=" + status + "]";
	}

	public static void main(String[] args) {
		ArrayList<Orders> a = new ArrayList<Orders>();
		a.add(new Orders(12000, "Accepted"));
		a.add(new Orders(1000, "Completed"));
		a.add(new Orders(22000, "Rejected"));
		a.add(new Orders(2000, "Completed"));
		a.add(new Orders(12000, "Accepted"));

		Price p = (a1, b1) -> a1 > b1 ? a1 : 0;
		for (int index = 0; index < a.size(); index++) {
			double result = p.greater(a.get(index).getPrice(), 10000);
			if (result > 0)
				System.out.println(result + " " + a.get(index).getStatus());
		}
		System.out.println(".............................................");
		Status s = (a1, b1, c1) -> (a1 == b1 || a1 == c1) ? a1 : "no";
		for (int index = 0; index < a.size(); index++) {
			String result = s.status(a.get(index).getStatus(), "Accepted", "Completed");
			if (result != "no") {
				System.out.println(result + " " + a.get(index).getPrice());
			}
		}

	}
}
