package q11;

public class Complaint {
String complaint;
Customer customer;
Complaint()
{
	this.complaint=null;
	this.customer=null;
}
Complaint(String a,Customer b)
{
	this.complaint=a;
	this.customer=b;
}
void display()
{
	System.out.println("name: "+this.customer.name+" id: "+this.customer.id+" country: "+this.customer.country+" complaint: "+this.complaint);

	
}
}
