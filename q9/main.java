package q9;

import java.util.Scanner;

//import q8.Address;
//import q8.Customer;

public class main {

public static void main(String[] args)
{
	Scanner var =new Scanner(System.in);
	System.out.println("Enter the No. of customers: ");
	int n=var.nextInt();
	var.nextLine();
	int j;
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
	
	
	Address add=new Address(b,c,p);
	Customer cust=new Customer(a,add);
	System.out.println(cust);
}
}
}
