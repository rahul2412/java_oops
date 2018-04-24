package fill_blanks;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String x=sc.next();
x=x.toLowerCase();
String y=sc.next();
y=y.toLowerCase();


	String arr[]=y.split(":");
	
	/*for(String a:arr)
		{
		System.out.println(a);
		}*/
	int flag=0;
	
	for(int i=0;i<arr.length;i++)
	{ if(arr[i].length()!=x.length())
		continue;
		
	flag=0;
		for(int j=0;j<x.length();j++)
		{
			if(x.charAt(j)=='_')
				continue;
			if(arr[i].charAt(j)!=x.charAt(j))
				{flag=1;
				break;
				}
		}
		if(flag==0)
			{
			System.out.print(arr[i]+':');
			 }
			}
	}
		
	}


