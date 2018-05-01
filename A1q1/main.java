package A1q1;
import java.util.*;
class periArea
{
	double rectangleArea(double l,double b)
	{
		return l*b;
	}
	double rectanglePerimeter(double l,double b)
	{
		return 2*(l+b);
	}
	double circleArea(double r)
	{
		return 3.14*r*r;
	}
	double circlePerimeter(double r)
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
		System.out.println("Area of rect is "+ob.rectangleArea(l,b));
		System.out.println("perimeter of rect is "+ob.rectanglePerimeter(l,b));
		System.out.println("Area of circle is "+ob.circleArea(r));
		System.out.println("perimeter of rect is "+ob.circlePerimeter(r));



	}

}
