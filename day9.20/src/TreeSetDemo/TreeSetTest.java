package TreeSetDemo;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 * @author Administrator
 *根据字符串大小进行排序 
 *  20，4，-8，30，50.19
 */




public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		TreeSet TS = new TreeSet(new ComparetorByLength());
		TS.add("20");
		TS.add("4");
		TS.add("-8");
		TS.add("30");
		TS.add("50");
		TS.add("19");
		
		Iterator it = TS.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
	}

}
