package hack_election;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var=new Scanner(System.in);
		
		ArrayList <String> al=new ArrayList<String>();
		int n=var.nextInt();
		
		for(int i=0;i<n;i++)
		al.add(var.next());
		
		//Collections.sort(al);
		System.out.println(al);
		
		int count=1,num=-1,index=-1;
		for(int i=0;i<al.size()-1;i++)
		{ count=1;
			for(int j=i+1;j<al.size();j++)
			{ 
				if(al.get(i).equals(al.get(j)))
				{
					count++;
				}
				
				
			}
			if(count>=num)
				{
				num=count;
				index=i;
				}
		}
		System.out.println(al.get(index)+" won with "+num+" votes");
	}

}
