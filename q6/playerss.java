package q6;

public class playerss {

	private String name;
	 private int age;
	private String country;
	
	playerss()
	{
	this.name="";
	this.age=0;
	this.country="";
	
	}
	
	playerss(String a,int b,String c)
	{
	this.name=a;
	this.age=b;
	this.country=c;
	
	}
	
void setName(String a)
	
	{
		this.name=a;
	};
void setAge(int b)
	
	{
		this.age=b;
	};
void setCountry(String c)

{
	this.country=c;
};
	
	String getName()

	{
		return this.name;
	};
	int getAge()

	{
		return this.age;
	};
	String getCountry()

	{
	return this.country;
	};
 public String toString()
{
	return "name:"+this.name+" age:"+this.age+" country:"+this.country;
}
}
