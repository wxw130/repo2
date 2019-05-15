
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
	LinkedList link = new LinkedList();
	
	link.add("abc1");
	link.add("abc2");
	link.add("abc3");
	link.add("abc4");
	
	System.out.println(link.getFirst());
	System.out.println(link.getLast());
	System.out.println(link);
	
//	System.out.println(link.removeFirst());
//	System.out.println(link.removeLast());
//	System.out.println(link);
	
//	while(!link.isEmpty()){
//		System.out.println(link.removeLast());
//	}
	
	Iterator it = link.iterator();
	
	while(it.hasNext()){
		
		System.out.println(it.next());
		}
	}
	

}

