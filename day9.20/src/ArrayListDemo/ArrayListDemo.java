package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

import person.Person;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		ArrayList a = new ArrayList();
		
		a.add(new Person("王小文",19));
		a.add(new Person("小明",20));
		a.add(new Person("小红",21));
		a.add(new Person("小刚",22));
		
		Iterator it =a.iterator();
		while(it.hasNext()){
			Person p =(Person)(it.next());
			System.out.println(p.getName()+"...."+p.getAge());
			
		}

	}

}
