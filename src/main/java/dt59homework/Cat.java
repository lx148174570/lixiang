/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:14:38 <br/>
 * @author   XIANGLi
 * @version
 * @see homework2
 */
package dt59homework;

public class Cat {
	String name;
	String color;
	int age;
public Cat(String a,String b,int c){

	name=a;
	color=b;
	age=c;
	System.out.println("猫的名字"+name+"猫的颜色"+color+"猫的年龄"+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Cat cat= new Cat("小花","黑色",10);
	}

}
