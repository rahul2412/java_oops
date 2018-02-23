package q10;

import java.util.Scanner;



public class main {
	public static void main(String[] args)
	{
	Scanner var =new Scanner(System.in);
	System.out.println("Enter the No. of customers: ");
	int n=var.nextInt();
	var.nextLine();
	int j;
	Address add[]=new Address[10];
	Customer cust[]=new Customer[10];
	for(int i=0;i<n;i++)
	{
	j=i+1;
	System.out.println("Enter the Customer details "+j);
	System.out.println("Enter the name: ");
	String a=var.nextLine();
	//var.next();
	System.out.println("Enter Custom address: ");
	System.out.println("Enter the street: ");
	String b=var.nextLine();

	System.out.println("Enter the city: ");
	String c=var.nextLine();
//var.nextLine();
	System.out.println("Enter the pincode: ");
	int p=var.nextInt();
var.nextLine();
	
	
	 add[i]=new Address(b,c,p);
	 cust[i]=new Customer(a,add[i]);
	 
	//System.out.println(cust);
}
	int l=1,flag=0;
	for(int i=0;i<n-1;i++)
	{
		for(int k=i+1;k<n;k++)
			
{
if(cust[i].equals(cust[k]))
{ flag=1;
System.out.println("The duplicate customer details: ");
	System.out.println(l+") "+cust[i]);
}
}
		if(flag==0)
			System.out.println("No duplicates found");
	}

}
}
