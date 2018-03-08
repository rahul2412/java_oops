package hash_ds;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner var=new Scanner(System.in);
HashMap<Integer,String> hm=new HashMap<Integer,String>();  
hm.put(1,"Rahul");  
hm.put(2,"ravi");  
hm.put(3,"zombie");  
for(Map.Entry m:hm.entrySet()){  
 System.out.println(m.getKey()+" "+m.getValue());  
	}
System.out.println(hm.size());  

HashSet<String> hs=new HashSet<String>();
hs.add("rahul");
hs.add("ravi");
hs.add("rahul");
hs.add("zom");

/*Iterator iterator = hs.iterator(); 

// check values
while (iterator.hasNext()) {
   System.out.println("Value: "+iterator.next() + " ");  
   */
for(String m:hs){  
	 System.out.println(m);  
		}
System.out.println(hs.size());  


}
}