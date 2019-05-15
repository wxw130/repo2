package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

import person.Person;

public class CopyOfArrayListDemo_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		ArrayList a = new ArrayList();
		
		a.add(new Person("王小文",19));
		a.add(new Person("王小文",19));
		a.add(new Person("王小文",19));
		a.add(new Person("王小文",19));
		a.add(new Person("小明",20));
		a.add(new Person("小红",21));
		a.add(new Person("小刚",22));
		
			a =GetSingleElement(a);
			Iterator tt = a.iterator();
			while(tt.hasNext()){
				Person p2 =(Person)tt.next();
				System.out.println(p2.getName()+"...."+p2.getAge());
			}
		}

	
	public static ArrayList GetSingleElement(ArrayList al){
		
		//创建一个临时容器
		ArrayList temp = new ArrayList();
		
		Iterator it =al.iterator();
		while(it.hasNext()){
			Person p =(Person)(it.next());
			if(!temp.contains(p)){
				temp.add(p);
			}
		}
		return temp;

	}
}