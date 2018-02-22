package getset;

import java.util.Scanner;

public class mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner var=new Scanner(System.in);
		play p=new play();
		System.out.println("enter Name:");
		String a=var.nextLine();
		System.out.println("enter age:");
		p.setName(a);

		int b=var.nextInt();
		p.setAge(b);
		System.out.println("enter Country:");

		var.nextLine();
		String c=var.nextLine();
		p.setCountry(c);
		//player1 p=new player1(a,b,c);

		System.out.println("Player Details:");
		System.out.println("Name is "+p.getName());
		System.out.println("Age is "+p.getAge());
		System.out.println("Country is "+p.getCountry());


	}

}
