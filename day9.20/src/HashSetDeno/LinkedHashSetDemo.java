package HashSetDeno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		HashSet Hs = new LinkedHashSet();
		
		Hs.add("abc1");
		Hs.add("abc2");
		Hs.add("abc3");
		Hs.add("abc4");
		Hs.add("abc5");
		Hs.add("abc6");
		
		Iterator it = Hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
