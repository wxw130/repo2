package person;

public class Person /*extends Object*/ implements Comparable {
	
	public String name ;
	public int age ; 
	
	public Person(String name ,int age){
		this.age=age;
		this.name=name;
	}
	
	
	/* （非 Javadoc）
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		// TODO 自动生成的方法存根
		return name.hashCode()+age*18;
		
	}



	/* （非 Javadoc）
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		// TODO 自动生成的方法存根
		if(this==obj){
			return true;
		}
		
		if(!(obj instanceof Person)){
			throw new ClassCastException("类型错误");
		}
		
		Person p = (Person)obj;
		return this.name.equals(p.name)&&this.age==p.age;
	}

	
	/* （非 Javadoc）
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		
		Person p = (Person)o;
		int temp = this.getAge()-p.getAge();
		return temp==0?this.getName().compareTo(p.getName()) : temp;
	}

	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
