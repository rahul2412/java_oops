package old;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var=new Scanner(System.in);
		
Player p=new Player();
System.out.println("enter Name:");
p.name=var.nextLine();
System.out.println("enter age:");

p.age=var.nextInt();
System.out.println("enter Country:");

var.nextLine();
p.country=var.nextLine();
System.out.println("Player Details:");
System.out.println("Name is "+p.name);
System.out.println("Age is "+p.age);
System.out.println("Country is "+p.country);


	}

}
