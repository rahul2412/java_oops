package useer_exception;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var =new Scanner(System.in);
int amount=2000;
int x;
System.out.println("Enter withdrawl amount");
x=var.nextInt();

	try {
		if(x>amount)
	//lessBalance b=new lessBalance();
	throw new lessBalance("Not optimal balance");
		else
		{
			int k=amount-x;
			System.out.println("Balance left "+k);
			}
		}

finally {
	
}

	}

}
class lessBalance extends Exception
{
	lessBalance(String s)
	{
		super(s);
	}
}