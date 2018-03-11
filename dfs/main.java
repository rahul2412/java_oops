package dfs;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner var =new Scanner(System.in);
int n=var.nextInt();
int m=var.nextInt();
int a[][]=new int[10][10];
for(int i=0;i<10;i++)
{
	for(int j=0;j<10;j++)
	{
		a[i][j]=0;
	}
}
for(int i=1;i<=m;i++)
{
	int e1=var.nextInt();
	int e2=var.nextInt();
	a[e1][e2]=1;
}
/*
 
{
	for(int j=0;j<10;j++)
	{
		System.out.print(a[i][j]);
	}
System.out.println();
}
*/
int s=var.nextInt();
int v[]=new int[10];
v[s]=1;

/*for(int i=0;i<n;i++)
	System.out.print(v[i]);*/
int count=0;
count++;
System.out.print(s);

for(int j=0;j<n;j++)
{ 
if( (a[s][j]==1|| a[j][s]==1)&&v[j]==0)
	{
		v[j]=1;
		count++;
		s=j;
		System.out.print(s);
		j=0;
		
	}

}
	}

}
