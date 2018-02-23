package q12;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner var=new Scanner(System.in);
System.out.println("1)Checking Account");
System.out.println("2)Saving Account");
System.out.println("3)Fixed Account");
System.out.println("Enter Account Type");
int x=var.nextInt();
var.nextLine();
if(x==1)
{
	System.out.println("Enter Account No.");
	String a=var.nextLine();
	//var.nextLine();
	System.out.println("Enter Account Amount");
	double b=var.nextDouble();
	var.nextLine();
	System.out.println("Enter Account Holder");
	String c=var.nextLine();
	CheckingAccount check=new CheckingAccount(a,b,c);
	System.out.println("Checking Account");
	check.getInfo();
}
else if(x==2)
{
	System.out.println("Enter Account No.");
	String a=var.nextLine();
	//var.nextLine();
	System.out.println("Enter Account Amount");
	double b=var.nextDouble();
	var.nextLine();
	System.out.println("Enter Account Holder");
	String c=var.nextLine();
	

	System.out.println("Enter interest rate");
	double d=var.nextDouble();


	SavingAccount s=new SavingAccount(a,b,c,d);
	System.out.println("Savings Account");
	s.getInfo();

}
else if(x==3)
{
	System.out.println("Enter Account No.");
	String a=var.nextLine();
	//var.nextLine();
	System.out.println("Enter Account Amount");
	double b=var.nextDouble();
	var.nextLine();

	System.out.println("Enter Account Holder");
	String c=var.nextLine();
	

	System.out.println("Enter No of years");
	int d=var.nextInt();
	FixedAccount f=new FixedAccount(a,b,c,d);
	System.out.println("Fixed Account");
	f.getInfo();

}
else
	System.out.println("Invalid account type");

	


	}

}
class Account {
	private String AccountNo;
	private double amount;
	private String AccountHolder;
	
	Account(String a,double b,String c)
	{
		this.AccountNo=a;
		this.amount=b;
		this.AccountHolder=c;
	}
	void geInfo()
	{
		System.out.print("AccountNo: "+AccountNo+" amount "+amount+" AccountHolder "+AccountHolder);
	}
	
}
class SavingAccount extends Account{
	private double rate;
	SavingAccount(String a,double b,String c,double d)
	{
		super(a,b,c);
		this.rate=d;
	}
	void getInfo()
	{
		super.geInfo();
		System.out.println(" rate "+rate);
	}
}
class FixedAccount extends Account{
	private int years;
	FixedAccount(String a,double b,String c,int d)
	{
		super(a,b,c);
		this.years=d;
	}
	void getInfo()
	{ 
		super.geInfo();
		System.out.println(" years "+years);
	}
}
class CheckingAccount extends Account{
	CheckingAccount(String a,double b,String c)
	{ 
		super(a,b,c);
		
	}
	void getInfo()
	{
		super.geInfo();
		//System.out.println("years "+years);
	}
}
