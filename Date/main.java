package Date;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner var=new Scanner(System.in);
		int day=var.nextInt();
		int month=var.nextInt();		
		int year=var.nextInt();
		
date d=new date();
int c=d.check(year,month,day);
if(c==0)
{
	
}
else
{
d.setDate(year, month, day);
/*
d.setYear(year);
d.setMonth(month);
d.setDay(day);
*/
System.out.println(d);
		
}
	}

}
