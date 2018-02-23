package q9;

public class Customer {
String name;
Address address;
	Customer()
	{
this.name=null;
this.address=null;
	}
	Customer(String a,Address address)
	
	{
	
		this.name=a;
		this.address=address;
	}
	public String toString()
	{
		return this.name+" "+this.address.toString();
	}
}
