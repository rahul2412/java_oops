package nto1;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner var=new Scanner(System.in);
int n=var.nextInt();
System.out.println(reduce(n));
	}
	static int reduce(int n)
	{
		if(n==1)
		 return 0;
			if(n%3==0)
			{
				return 1+reduce(n/3);
			}
			else if((n-1)%3==0)
			{
				return 1+reduce(n-1);
			}
			else if(n%2==0)
				{
					return 1+reduce(n/2);
					
				}
				else
					return 1+reduce(n-1);
	}

}
