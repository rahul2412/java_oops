package dfs_stack;
import java.util.*;
public class Main {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer>s=new Stack<Integer>();
Scanner var=new Scanner(System.in);
int n=var.nextInt();
int m=var.nextInt();
int arr[][]=new int[m][m];
for(int i=0;i<m;i++)
{
	int a=var.nextInt();
	int b=var.nextInt();
	
	arr[a][b]=1;

}
/*for(int i=0;i<m;i++)
{
	for(int j=0;j<m;j++)
		System.out.print(arr[i][j]);
}*/
int r=var.nextInt();
int v[]=new int[n];
v[r]=1;
int count=1;
s.push(r);
System.out.print(s.peek());
// Stack logic
while(!s.empty())
{
	for(int i=0;i<n;i++)
	{ r=s.peek();
		if((arr[r][i]==1 || arr[i][r]==1) && v[i]==0)
		{
			v[i]=1;
			r=i;
			s.push(r);
			count++;
			i=-1;
			System.out.print(r);
			if(count==n)
				break;
		}
	}
	if(count==n)
		break;
		
			s.pop();
			
		}
	}
	//s.pop();


	}


