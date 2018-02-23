package q8;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner var =new Scanner(System.in);
		System.out.println("Enter the Customer details: ");
		System.out.println("Enter the name: ");
		String a=var.nextLine();
		System.out.println("Enter the email: ");
		String b=var.nextLine();

		System.out.println("Enter the type: ");
		String c=var.nextLine();

		System.out.println("Enter Custom address: ");
		System.out.println("Enter the street: ");
		String e=var.nextLine();

		System.out.println("Enter the city: ");
		String f=var.nextLine();

		System.out.println("Enter the pincode: ");
		int p=var.nextInt();
var.nextLine();
		System.out.println("Enter the country: ");
		String g=var.nextLine();
		
		Address add=new Address(e,f,p,g);
		Customer cust=new Customer(a,b,c,add);
		cust.displayDetails();





	}

}
