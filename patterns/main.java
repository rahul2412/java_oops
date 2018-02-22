package patterns;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner var=new Scanner(System.in);
char c=var.next().charAt(0);
//char d='A';
if(c>64&&c<91)
{
	for(char i=c;i>64;i--)
	{
		for(char j=65;j<=i;j++)
		System.out.print((j)+" ");
		System.out.println();
		
	}
	
}
else
{
	System.out.println("Invalid input");
}
	}
	

}
