package some_of_powers;
import java.util.*;
public class main {
public static void main(String[] args)

{
	

Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int prev=0;
int sum=0;
while(x!=0) 
{
	int m=x%10;
	sum+=Math.pow(m,prev);
	x/=10;
	prev=m;
}
System.out.println(sum);
}
}