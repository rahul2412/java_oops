package q13;


import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner var=new Scanner(System.in);
System.out.println("1)Privelege Account");
System.out.println("2)Senior citizen Account");
//System.out.println("3)Fixed Account");
System.out.println("Enter Account Type");
int x=var.nextInt();
var.nextLine();
if(x==1)
{
	System.out.println("Enter Name");
	String a=var.nextLine();
	//var.nextLine();
	System.out.println("Enter Age");
	int c=var.nextInt();
	var.nextLine();
	System.out.println("Enter Adress");
	String b=var.nextLine();
	System.out.println("Enter mobile no.");
	String d=var.nextLine();


	PriveledgeCustomer priv=new PriveledgeCustomer(a,b,c,d);
	System.out.println("Enter Purchased Amount");

	double z=var.nextDouble();

	System.out.println("Bill details");
	priv.display(z);
}
else if(x==2)
{
	System.out.println("Enter Name");
	String a=var.nextLine();
	//var.nextLine();
	System.out.println("Enter Age");
	int c=var.nextInt();
	var.nextLine();
	System.out.println("Enter Adress");
	String b=var.nextLine();
	System.out.println("Enter mobile no.");
	String d=var.nextLine();


	SeniorCitizen old=new SeniorCitizen(a,b,c,d);
	System.out.println("Enter Purchased Amount");

	double z=var.nextDouble();
	System.out.println("Bill details");
	old.display(z);

}

else
	System.out.println("Invalid account type");

	


	}

}
class Customer {
	private String Name;
	private String Address;
	private int age;
	
	private String mobile;
	
	Customer(String a,String b,int c,String d)
	{
		this.Name=a;
		this.Address=b;
		this.age=c;
		this.mobile=d;
	}
	void display()
	{
		System.out.print("Name: "+Name+" address "+Address+" Age "+age+" mobile "+mobile);
	}
	
}
class SeniorCitizen extends Customer{
	//private double rate;
	SeniorCitizen(String a,String b,int c,String d)
	{
		super(a,b,c,d);
		//this.rate=d;
	}
	void display(double x)
	{
		super.display();
		System.out.print(" amount to pay "+x);

		double y=x-12*x/100;

		System.out.printf(" amount %.2f",y);
	}
}
class PriveledgeCustomer extends Customer{
	//private int years;
	PriveledgeCustomer(String a,String b,int c,String d)
	{
		super(a,b,c,d);
		//this.years=d;
	}
	void display(double x)
	{ 
		super.display();
		System.out.print(" amount to pay "+x);

		double y=x-30*x/100;
		System.out.printf(" amount %.2f",y);
	}
}
