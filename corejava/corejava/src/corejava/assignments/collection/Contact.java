package corejava.assignments.collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Contact {
	private	long PhoneNumber;
	private	String Name;
	private	String Email;
	private	Gender gender;
	
	public Contact(long phoneNumber, String name, String email, Gender gender) {
		super();
		PhoneNumber = phoneNumber;
		Name = name;
		Email = email;
		this.gender = gender;
	}



	public static void main(String[] args) {
		Contact c1=new Contact(99450055,"vp","vp22@gmail.com",Gender.Female);
	
		
		Contact c=new Contact(9945005,"vp","vp22@gmail.com",Gender.Male);

		TreeMap<Long,Contact> tm =new TreeMap<Long, Contact>();
		tm.put(c.PhoneNumber, c);
		tm.put(c1.PhoneNumber, c1);
		System.out.println("key");
		for(Entry<Long,Contact> ct:tm.entrySet())
			System.out.println(ct.getKey());
		
		System.out.println("value");
		for(Entry<Long,Contact> ct:tm.entrySet())
			System.out.println(ct.getValue());
		
		System.out.println("key-value");
		for(Entry<Long,Contact> ct:tm.entrySet())
		System.out.println(ct);
		

	}



	@Override
	public String toString() {
		return "Contact [PhoneNumber=" + PhoneNumber + ", Name=" + Name + ", Email=" + Email + ", gender=" + gender
				+ "]";
	}
	

}

	enum Gender{Male,Female};

