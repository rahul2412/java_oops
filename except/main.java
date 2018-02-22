package except;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner var =new Scanner(System.in);
		try {
			int a=27;
			int d=var.nextInt();
			int c=a/d;
			System.out.println(c);

		}
		/*
		catch(Exception e)
		{
			//e.printStackTrace();
			String j=e.getMessage();
			System.out.println(j);
		}
		*/
		//System.out.println(" after catch");
		finally {
			System.out.println(" Mein to chalunga meri marzi");

		}
	}

}
