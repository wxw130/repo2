package HashSetDeno;

import java.util.HashSet;
import java.util.Iterator;

import person.Person;



public class HashSetLDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		
		HashSet HS = new HashSet();
		
//		HS.add("ABC1");
//		HS.add("ABC2");
//		HS.add("ABC3");
//		HS.add("ABC4");
//		HS.add("ABC5");
//		HS.add("ABC6");
		
		HS.add(new Person("老哥",33));
		HS.add(new Person("老哥",33));
		HS.add(new Person("老哥",33));
		HS.add(new Person("老铁",55));
		HS.add(new Person("沙雕网友",22));
		HS.add(new Person("小猪佩奇",19));
	
		
		Iterator it = HS.iterator();
		while(it.hasNext()){
			
			Person p = (Person)it.next();
			System.out.println(p.getName()+"......"+p.getAge());
	
		}

	}

}
