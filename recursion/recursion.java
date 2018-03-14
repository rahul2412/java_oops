package recursion;
public class recursion {
static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.printf("fact is %d \n",fact(5));

int arr[]= {2,4,6,8,9};
System.out.printf("sum is %d \n",printArrSum(arr,4));
printRev(arr,4);
System.out.println("\nfib is "+fib(6));
checkPrime(121,2);
	}
	
	public static int fact(int n)
	{ if(n==1)
		return 1;
	else 
		return n*fact(n-1);
	}
	
	public static int printArrSum(int a[],int n)
	{ if(n<0)
		return 0;
	else 
		return a[n]+printArrSum(a,n-1);
	}
	
	public static void printRev(int a[],int n)
	{ if(n<0)
		return ;
	else 
		printRev(a,n-1);
		System.out.print(a[n]+" ");
	//printRev(a,n-1);
	}
	public static int fact(int n)
	{ if(n==1)
		return 1;
	else 
		return n*fact(n-1);
	}
	public static int fib(int n)
	{ if(n==0)
		return 0;
	if(n==1)
		return 1;
	else 
		return fib(n-1)+fib(n-2);
	}
	
	public static void checkPrime(int n,int c)
	{ if(n==2)
		System.out.println("Yes");
	else if(n%c==0)
		System.out.println("No");

	else if(c<=n/2)
		checkPrime(n,c+1);
	
	else 
		System.out.println("Yes");

		
	}

}
