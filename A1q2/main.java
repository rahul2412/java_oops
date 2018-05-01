package A1q2;

import java.util.Scanner;
class periArea
{
	double calculateArea(double l,double b)
	{
		return l*b;
	}
	double calculateArea(double r)
	{
		return 3.14*r*r;
	}
	double calculatePerimeter(double l,double b)
	{
		return 2*(l+b);
	}
	
	double calculatePerimeter(double r)
	{
		return 2*3.14*r;
	}
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		periArea ob=new periArea();
		System.out.println("enter length");
		double l=sc.nextDouble();
		System.out.println("enter breadth");
		double b=sc.nextDouble();
		System.out.println("enter radius");
		double r=sc.nextDouble();
		System.out.println("Area of rect is "+ob.calculateArea(l,b));
		System.out.println("perimeter of rect is "+ob.calculatePerimeter(l,b));
		System.out.println("Area of circle is "+ob.calculateArea(r));
		System.out.println("perimeter of rect is "+ob.calculatePerimeter(r));



	}

}
