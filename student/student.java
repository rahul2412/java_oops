package student;
import java.util.*;
public class student {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var=new Scanner(System.in);
		int n=var.nextInt();
		
		String name=var.next();
		
		String address=var.next();
		
		
	String courses[]=new String[n];
		int grades[]=new int[n];
		for(int i=0;i<n;i++)
		{
			
			courses[i]=var.next();
			grades[i]=var.nextInt();

		}


		stud s=new stud(name,address,courses,grades);
		s.print();
		s.avg();

	}
}
	class stud
	{
	private String name;
	private String address;
	private String courses[];
	private int grades[];

		stud(String name,String address,String courses[],int grades[])
		{
			this.name=name;
			this.address=address;
			this.courses=courses;
			this.grades=grades;
			
		}
		void print()
		{ int n=courses.length;
			System.out.println(this.name+" "+this.address);
			for(int i=0;i<n;i++)
			System.out.println(this.courses[i]+" "+this.grades[i]);
		}
		void avg()
		{
			int avg=0;
			int n=grades.length;
			for(int i=0;i<n;i++)
				avg+=grades[i];
			System.out.println("average is "+avg);
		}
	}

