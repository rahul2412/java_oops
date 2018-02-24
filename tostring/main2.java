package tostring;

import java.util.Scanner;



public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var=new Scanner(System.in);
		System.out.println("enter Name:");
		String a=var.nextLine();
		System.out.println("enter age:");
		

		int b=var.nextInt();
		
		System.out.println("enter Country:");

		var.nextLine();
		String c=var.nextLine();
		

		plays p=new plays(a,b,c);

		//player1 p=new player1(a,b,c);

		System.out.println(p);
		/*System.out.println("Name is "+p.getName());
		System.out.println("Age is "+p.getAge());
		System.out.println("Country is "+p.getCountry());*/

	}

}
