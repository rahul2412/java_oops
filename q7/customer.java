package q7;

public class customer {
String customerName;
String customerEmail;
String customerType;
String customerAddress;

customer(String a,String b,String c,String d)
{
	this.customerName=a;
	this.customerEmail=b;
	this.customerType=c;
	this.customerAddress=d;

	
}
	void display_details() {
		System.out.println("Name: "+this.customerName);
		System.out.println("Email: "+this.customerEmail);
		System.out.println("Type: "+this.customerType);
		System.out.println("Location: "+this.customerAddress);

	}
}
