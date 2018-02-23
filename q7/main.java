package q7;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var=new Scanner(System.in);
		System.out.println("enter Customer details:");
		System.out.println("enter the name:");
		String a=var.nextLine();
		//var.nextLine();

		System.out.println("enter the email:");
		String b=var.nextLine();
		//var.nextLine();

		System.out.println("enter the type:");
		String c=var.nextLine();
		//var.nextLine();

		System.out.println("enter the location:");
		String d=var.nextLine();
		customer p=new customer(a,b,c,d);
		p.display_details();



	}

}
