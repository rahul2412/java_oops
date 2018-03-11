package Stack_Queue;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		// Stack
		Stack<String>s=new Stack<String>();
		s.push("rahul");
		s.push("passi");
		s.push("rah");

		String k=s.peek();
		s.push("god");
		s.pop();
System.out.println(s);
System.out.println(k);
System.out.println(s.search("rahul"));

System.out.println(s.size());

// Queue
Queue<Integer>q=new LinkedList<>();
q.add(0);
q.add(3);
q.add(1);
System.out.println(q.peek());
q.remove();
System.out.println(q);
System.out.println(q.size());





	}

}
