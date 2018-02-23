package q8;

public class Address {
private String street;
private String city;
private int pincode;
private String country;

Address(String a,String b,int c,String d)
{
	this.street=a;
	this.city=b;
	this.pincode=c;
	this.country=d;

	
}
	void displayAddress() {
		System.out.println("Street: "+this.street);
		System.out.println("City: "+this.city);
		System.out.println("Pincode: "+this.pincode);
		System.out.println("Country: "+this.country);

	}
}
