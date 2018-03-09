package hack_election1;
import java.util.*;
 
public class Main
{
       public static void main(String args[])
    {
    	  
    	   Scanner var=new Scanner(System.in);
    	  int n= var.nextInt();
    	  ArrayList<String> al=new ArrayList<String>();
    	  
    	  
    	  for(int i=0;i<n;i++)
    	  {
    		al.add(var.next());
    	  }
        
        HashMap<String,Integer> map =
                    new HashMap<String, Integer>();
        
        for (String str : al)
        {
            if (map.keySet().contains(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }
 
        
        String winner = "";
        int votes=0;
        
        for (Map.Entry<String,Integer> entry: map.entrySet())
        {
            String key  = entry.getKey();
            int val = entry.getValue();
            if (val > votes)
            {
                votes = val;
                winner = key;
                
            }
 
            else if (val == votes &&
                winner.compareTo(key) < 0)
                winner = key;
        }
        System.out.println("Winning Candidate is : " +
                                              winner+" with "+votes+" votes");
    }
 
    
    
}