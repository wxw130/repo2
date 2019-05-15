package TreeSetDemo;

import java.util.Iterator;
import java.util.TreeSet;

import person.Person;

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		TreeSet TS = new TreeSet(new ComparetorByName());
		
		TS.add(new Person("佩奇",5));
		TS.add(new Person("社会人",25));
		TS.add(new Person("吊毛",55));
		TS.add(new Person("沙雕",35));
		
		Iterator it = TS.iterator();
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p.getName()+"......"+p.getAge());
			
		}
		
		
	}

}
