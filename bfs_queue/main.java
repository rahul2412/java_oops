package bfs_queue;

import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>q=new LinkedList<Integer>();
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
		q.add(r);
		System.out.print(q.peek());
		// Queue logic
		while(!q.isEmpty())
		{ r=q.peek();
			for(int i=0;i<n;i++)
			{ 
				if((arr[r][i]==1 || arr[i][r]==1) && v[i]==0)
				{
					v[i]=1;
					
					q.add(i);
					count++;
					
					System.out.print(i);
					if(count==n)
						break;
				}
			}
			if(count==n)
				break;
				
					q.remove();
					
				}

	}

}
