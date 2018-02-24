package tostring;

public class plays {
	
	private String name;
	 private int age;
	private String country;
	
	plays()
	{
	name="";
	age=0;
	country="";
	
	}
	
	plays(String a,int b,String c)
	{
	name=a;
	age=b;
	country=c;
	
	}
 public String toString()
{
	return "name is: "+this.name+" age is: "+this.age+" country is: "+this.country;
}
}
