package q8;

public class Customer {

	String customerName;
	String customerEmail;
	String customerType;
	Address address;

	Customer(String a,String b,String c,Address d)
	{
		this.customerName=a;
		this.customerEmail=b;
		this.customerType=c;
		this.address=d;

		
	}
		void displayDetails() {
			System.out.println("Name: "+this.customerName);
			System.out.println("Email: "+this.customerEmail);
			System.out.println("Type: "+this.customerType);
			address.displayAddress();
			//System.out.println("Location: "+this.address);
}
}
