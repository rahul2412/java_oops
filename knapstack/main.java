package knapstack;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	
Scanner var =new Scanner(System.in);
double w[]=new double[15];
double p[]=new double[15];
double d[]=new double[15];
	int m,n;
	System.out.println("enter max weight ");
	m=var.nextInt();

		System.out.println("enter no. ");
		n=var.nextInt();

	for(int i=0;i<n;i++)
	{
		w[i]=var.nextDouble();
		p[i]=var.nextDouble();
		d[i]=p[i]/w[i];
		

	}
	//int i;
	double temp1,temp2,temp3;
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(d[i]>d[j])
			{
				temp1=d[i];
				d[i]=d[j];
				d[j]=temp1;
				
				temp2=w[i];
				w[i]=w[j];
				w[j]=temp2;
				
				temp3=p[i];
				p[i]=p[j];
				p[j]=temp3;
			}
		}
	}
	
	
	for(int i=0;i<n;i++)
	{
		System.out.print(w[i]+" ");
	}
	System.out.println();
	for(int i=0;i<n;i++)
	{
		System.out.print(p[i]+" ");
	}
	System.out.println();
int i;
	for(i=0;i<n;i++)
	{
		System.out.print(d[i]+" ");
		
	}
	System.out.println();
	

	int k=i-1;
	double profit=0;
	double wt=0;
	for(i=k;i>=0;i--)
	{
		wt+=w[i];
		if(wt>m)
		{ double wgt=wt-w[i];
		wgt=m-wgt;
		
		profit+=d[i]*wgt;
		
		break;
		}
		else
			profit+=p[i];
			
			
	}
	
	//System.out.print(items+" items "+" of weight "+w[k]);
	//System.out.println();


	//double profit=items*p[k];
	System.out.print("Max Profit "+profit);

}
}
