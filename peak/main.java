package peak;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter no. of elements");

		int n=var.nextInt();
		for(int i=0;i<n;i++)
			arr[i]=var.nextInt();
		int max=-999;
			for(int i=0;i<n;i++)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}
			}
			System.out.println(max);

	}

}
