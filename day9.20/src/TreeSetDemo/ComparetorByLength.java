package TreeSetDemo;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ComparetorByLength implements Comparator {

	public int compare(Object o1, Object o2) {
		// TODO 自动生成的方法存根
		String s1 = (String)o1;
		String s2 = (String)o2;
		int temp = s1.compareTo(s2);
		return temp==0?s1.length()-s2.length():temp;
	}

}
