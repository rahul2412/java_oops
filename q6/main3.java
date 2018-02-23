package q6;

import java.util.Scanner;



public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		System.out.println("Enter no. of players ");
		Scanner var=new Scanner(System.in);
		n=var.nextInt();
				var.nextLine();
		playerss p[]=new playerss[n];
		int j;

		for(i=0;i<n;i++)
		{ j=i+1;
			System.out.println("Enter player "+j+" details:");

		System.out.println("enter Name:");
		String a=var.nextLine();
		System.out.println("enter age:");
		

		int b=var.nextInt();
		
		System.out.println("enter Country:");

		var.nextLine();
		String c=var.nextLine();
		//var.nextLine();
p[i]=new playerss(a,b,c);
		
		}
		playerBO x=new playerBO();

		System.out.println("Enter the name of the player to be searched:");
		String player_name=var.nextLine();
		x.searchByName(p,player_name);
		

		//var.nextLine();
		System.out.println("Enter the name of the country:");
		String country_name=var.nextLine();

		x.listPlayersBelongingToList(p,country_name);
		
		
	}

}
