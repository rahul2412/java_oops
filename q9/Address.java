package q9;

public class Address {

	private String city;
	private String street;
	private int pincode;
		Address()
		{
	this.city=null;
	this.street=null;
	this.pincode=0;
		}
		Address(String street,String city,int pincode)
		
		{
		
			this.street=street;
			this.city=city;
			this.pincode=pincode;
		}
		public String toString()
		{
			return this.street+","+this.city+"-"+this.pincode;
		}
}
