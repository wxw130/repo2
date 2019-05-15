package LinkedTest;

/*
 * 请使用LinkedList来模拟一个堆栈或者队列数据结构。
 * 
 * 堆栈：先进后出 First In Last Out  FILO
 * 
 * 队列：先进先出 First In First Out FIFO
 * 
 * 我们应该描述这样一个容器，给使用提供一个容器对象完成这两种结构中的一种。
 */


public class LinkedTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		DuiXiang DX = new DuiXiang();
		
		DX.Myadd("ABC1");
		DX.Myadd("abc2");
		DX.Myadd("ABC3");
		DX.Myadd("ABC4");
		
		while(!DX.isNull()){
			
			System.out.println(DX.Myget());
			
		}
		
		
		
		
		
		
		
	}

}
