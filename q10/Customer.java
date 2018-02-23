package q10;



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
			return this.name+"\nAddress: "+this.address.street+","+this.address.city+"-"+this.address.pincode;
		}
		public boolean equals(Customer obj)	
		{ if(obj.name.equals(this.name))
			{return this.address.equals(obj.address);
			}
		else
			return false;
			}
		}



