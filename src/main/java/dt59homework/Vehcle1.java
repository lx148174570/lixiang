package dt59homework;

public  abstract class Vehcle1 {
	protected String name;
	public Vehcle1(String name){
		this.name=name;
	}
	public void print(){
		System.out.println();
	
	

}
class Cat extends  Vehcle1{
	
	public Cat(String name) {
		super(name);
		System.out.println("在吃老鼠");
	}


	
	
	
}
