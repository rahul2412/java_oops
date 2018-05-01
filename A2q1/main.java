package A2q1;
import java.util.*;
public class main {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[101];
	System.out.println("Enter integers between 1 and 100:");

	while(true)
	{
		int x=sc.nextInt();
		if(x==0)
			break;
		arr[x]++;
	}
	for(int i=1;i<=100;i++)
	{
		if(arr[i]==0)
			continue;
		else if(arr[i]==1)
			System.out.println(i+" occurs "+arr[i]+" time");
		else
			System.out.println(i+" occurs "+arr[i]+" times");

	}
}
}
