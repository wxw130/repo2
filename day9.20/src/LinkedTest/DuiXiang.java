package LinkedTest;

import java.util.LinkedList;

public class DuiXiang {
	
	private LinkedList link;
	DuiXiang(){
		link = new LinkedList();
		
	}
	public void Myadd(Object obj){
		
		link.addFirst(obj);
	}
	
	public Object Myget(){
		
		return link.removeFirst();
	}
	
	public boolean isNull(){
		
		return link.isEmpty();
	}

}
