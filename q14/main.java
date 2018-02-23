package q14;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner var=new Scanner(System.in);

Account acc[]=new Account[10];

	System.out.println("Enter No. of transactions");
	int n=var.nextInt();
	//var.nextLine();
	for(int i=0;i<n;i++)
	{
	var.nextLine();
	System.out.println("Enter Account no");
	String a=var.nextLine();
	//var.nextLine();
	System.out.println("Enter Holder name");
	String b=var.nextLine();
	System.out.println("Enter secret code");

	String c=var.nextLine();
	System.out.println("Enter email address");

	String d=var.nextLine();
	System.out.println("Enter no of debits");
	int e=var.nextInt();
	System.out.println("Enter no of credits");
	int f=var.nextInt();

	

	acc[i]=new Account(a,b,c,d,e,f);
	}
	System.out.println("1)Generate statement from acc no");
	System.out.println("2)Generate statement fromm secret code and email");
	//Account ad=new Account();
	System.out.println("Enter Choice");
	int choice=var.nextInt();
if(choice==1)
{ 
	var.nextLine();
//Account bc=new Account();

	System.out.println("Enter Account No.");
	String y=var.nextLine();
	
	Account ob=Account.generate(acc,y);
	if(ob==null)
		System.out.println("No account Found");
	else
	ob.getDetails();
	

}
else if(choice==2)
{ var.nextLine();
	//Account bc=new Account();
	System.out.println("Enter Secret code");
	String sc=var.nextLine();
	//var.nextLine();
	System.out.println("Enter Email");
String email=var.nextLine();
//Account ob1=new Account();
 Account ob1=Account.generate(acc,sc,email);
if(ob1==null)
	System.out.println("No account Found");
else
ob1.getDetails();
	
}

else
{
	System.out.println("Invalid Choice");

}

	
	}

	

}

class Account{
	private String accountNo;
	private String holder;
	private String secret;
	private String email;
	private int debits;
	private int credits;

	Account(String a,String b,String c,String d,int e,int f)
	{
		this.accountNo=a;
		this.holder=b;
		this.secret=c;
		this.email=d;
		this.debits=e;
		this.credits=f;
	}
	

	
	Account() {
		// TODO Auto-generated constructor stub
		this.accountNo=null;
		this.holder=null;
		this.secret=null;
		this.email=null;
		this.debits=0;
		this.credits=0;
		
	}
	
	static Account generate(Account a[],String x,String y)
	{ 
		int i;
		int flag1=0;
		for(i=0;i<a.length;i++)
		{
			if(x.equals(a[i].secret)&& y.equals(a[i].email))
			{
				flag1=1;
				break;
			}
		}
		

		if(flag1==0)
			return null;
		else
				return a[i];	
	}

	static Account generate(Account a[],String x)
	{ 
		int i;
		int flag=0;
		for(i=0;i<a.length;i++)
		{
			if(x.equals(a[i].accountNo))
			{ flag=1;
				break;
			}
		}
if(flag==0)
	return null;
else
		return a[i];
	}
	
	
	void getDetails() {
		System.out.println("Account no "+this.accountNo);
		System.out.println("Holder name "+this.holder);
		System.out.println("debits "+this.debits);
		System.out.println("credits "+this.credits);

	}
}
