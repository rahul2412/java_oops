package add_using_strings;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String x=sc.next();
String y=sc.next();
String z="";
int a=x.length();
int b=y.length();
int carry=0;
if(a==b)
{
for(int i=a-1;i>=0;i--)
{
	
int m=0,k=0;
	int u=0;
	int l=0;
	
	u=Character.getNumericValue(x.charAt(i));
	l=Character.getNumericValue(y.charAt(i));


	
 m=u+l+carry;
if(m>=10)
{
	
	if(i==0)
	{
		while(m!=0)
		{
			int last=m%10;
			k=k*10+last;
			m/=10;
		}
		
	}
	else {
	k=m%10;
	carry=m/10;
	}
}
else
{
	carry=0;
}



z=z.concat(Integer.toString(k));

}


int l=z.length();
String p="";
char arr[]=z.toCharArray();
for(int i=l-1;i>=0;i--)
{
	p=p.concat(Character.toString(arr[i]));
}

System.out.println(p);

	}
	
	else
		
	{ if(b>a)
	{
		String temp="";
		temp=y;
		y=x;
		x=temp;
		int tempo=0;
		tempo=b;
		b=a;
		a=tempo;
	}
		int i=0,j=a-1;
		for(i=b-1;i>=0;i--)
		{
			
		int m=0,k=0;
			int u=0;
			int l=0;
			
			u=Character.getNumericValue(x.charAt(j));
			l=Character.getNumericValue(y.charAt(i));


			j--;
		 m=u+l+carry;
		if(m>=10)
		{
			
			k=m%10;
			carry=m/10;
		}
		else
		{
			carry=0;
		}


//System.out.print(k);
		z=z.concat(Integer.toString(k));

		}
for(int l=j;l>=0;l--)
{ int v=Character.getNumericValue(x.charAt(l));
v+=carry;
	z=z.concat(Integer.toString(v));
	carry=0;
}

		int l=z.length();
		String p="";
		char arr[]=z.toCharArray();
		for(i=l-1;i>=0;i--)
		{
			p=p.concat(Character.toString(arr[i]));
		}

		System.out.println(p);

	}

}}
