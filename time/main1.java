package time;

import java.util.Scanner;



public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var=new Scanner(System.in);
		int hours=var.nextInt();
		int mins=var.nextInt();		
		int secs=var.nextInt();
		
time d=new time();
d.setTime(hours, mins, secs);
d.next();
System.out.println(d);
	}

}
