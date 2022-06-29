package corejava.assignments.collection;

import java.util.HashSet;

public class Product {
	int id;
	String Name;

	public Product() {
		super();
		
	}

	public Product(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public static void main(String[] args) {
		HashSet<Product> al = new HashSet<Product>();
		Product p1=new Product(1,"Venu");
		Product p2=new Product(2,"Venu");
		Product p3=new Product(3,"Venu");
		Product p4=new Product(4,"Venu");
		Product p5=new Product(5,"Venu");
		Product p6=new Product(6,"Venu");
	
			
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		
		
	
		
	for (Product product : al) {
		System.out.println(product);
	}
		

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + "]";
	}
	

}
