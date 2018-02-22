package classes;

import java.util.Scanner;

public class main1 {

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
		player1 p=new player1(a,b,c);

		System.out.println("Player Details:");
		System.out.println("Name is "+p.name);
		System.out.println("Age is "+p.age);
		System.out.println("Country is "+p.country);

	}

}
