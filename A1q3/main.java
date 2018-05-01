package A1q3;
import java.util.*;
import java.util.regex.*; 
class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int flag=1;
Pattern p=Pattern.compile("\\W|_");
Pattern q=Pattern.compile("[A-Za-z0-9]*[0-9][0-9][0-9][0-9][0-9][A-Za-z0-9]*");
Pattern r=Pattern.compile("[A-Za-z0-9]*[A-za-z][A-za-z][A-za-z][A-za-z][A-za-z][A-Za-z0-9]*");

while(flag!=0)
{ 
System.out.println("Enter Password");

String s=sc.next();
Matcher m=p.matcher(s);
Matcher n=q.matcher(s);
Matcher o=r.matcher(s);

if(s.length()<5||s.length()>12)
{
	System.out.println("Invalid Password: Rule 1");
}
else if(m.find())
{
	System.out.println("Invalid Password: Rule 2");
}


else if(n.find()||o.find())
{
	System.out.println("Invalid Password: Rule 3");

}
else
	flag=0;
	}

System.out.println("Valid Password");

	}

}
