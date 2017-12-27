package dt59homework;

public class Person {

	static String name="李翔";
	String speak="chain";
	int age=20;
	Person(){	
		name="李翔";
		speak="japen";
		age=200;
		System.out.println("执行构造");
	}
	void print(){
		System.out.println("姓名"+this.name+"语言"+this.speak+"年龄"+this.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=null;
		person=new Person();
		person.print();

	}

}
