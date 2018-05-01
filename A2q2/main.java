package A2q2;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
boolean arr[]=new boolean[50];
for(int i=1;i<=50;i++)
{
	if(i==1)
	{
		for(int j=0;j<50;j++)
			arr[j]=true;
	}
	else if(i==2)
	{
		for(int j=1;j<50;j=j+2)
			arr[j]=false;
		
	}
		else
			{for(int j=i-1;j<50;j=j+i)
			{
				if(arr[j]==false)
					arr[j]=true;
				else
					arr[j]=false;
			}
}
}
String condition;
for(int i=0;i<50;i++)
	{ if(arr[i]==true)
		condition="open";
	else
		condition="closed";
	System.out.println("Locker L"+(i+1)+" is "+condition);}

	}

}
