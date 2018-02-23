package q10;

public class Address {
	 String city;
String street;
 int pincode;
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
		public boolean equals(Address obj)
		{
			if(this.street.equals(obj.street) && this.street.equals(obj.city) && this.pincode==obj.pincode)
				return true;
			else 
				return false;
		}
}
 