package q11;
import java.util.Scanner;
public class main {

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer cust[]=new Customer[100];
		Complaint comp[]=new Complaint[100];
		int j=0;
for(int i=0;i<100;i++)
{
	

Scanner var=new Scanner(System.in);
System.out.println("Enter customer name");
String a=var.nextLine();
if(a.equals(""))

	cust[i]=(Customer)cust[i-1].clone();
	
else
{
System.out.println("Enter the id");
String b=var.nextLine();
System.out.println("Enter the country");
String c=var.nextLine();


cust[i]=new Customer(a,b,c);
}
System.out.println("Enter the complaint");
String d=var.nextLine();
comp[i]=new Complaint(d,cust[i]);
j++;

System.out.println("add the complaint?");
String e=var.nextLine();
if(e.equals("no"))
	break;


}

for(int i=0;i<j;i++)
{
	comp[i].display();

}
	}

}
