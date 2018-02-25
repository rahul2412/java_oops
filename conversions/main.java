package conversions;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner var=new Scanner(System.in);
int x=var.nextInt();
System.out.println(Integer.bitCount(x));

System.out.println(Integer.toBinaryString(x));
System.out.println(x>>1);
String y=var.next();
System.out.println(Integer.parseInt(y,2));
	}

}
