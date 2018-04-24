package freq_in_series;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[10];
Scanner var=new Scanner(System.in);
int n=var.nextInt();
for(int i=0;i<n;i++)
{
	arr[i]=var.nextInt();
}
int fre[]=new int[10];
for(int i=0;i<n;i++)
{
while(arr[i]!=0)
{
int x=arr[i]%10;
fre[x]++;
arr[i]/=10;
}
}
int max=-1;
int l=-1;
/*for(int i=0;i<10;i++)
	System.out.print(fre[i]);*/

for(int i=0;i<10;i++)
{
	if(fre[i]>=max)
		{ max=fre[i];
	l=i; } 
}

System.out.println(l+" occurs "+max+" times ");
}
}