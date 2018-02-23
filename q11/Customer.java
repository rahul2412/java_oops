package q11;

public class Customer implements Cloneable {
String name;
String id;
String country;
Customer()
{
	this.name=null;
	this.id=null;
	this.country=null;
	
}

Customer(String a,String b,String c)
{
	this.name=a;
	this.id=b;
	this.country=c;
	
}
public Object clone()throws CloneNotSupportedException
{
	return super.clone();}
}
