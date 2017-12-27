/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:14:38 <br/>
 * @author   XIANGLi
 * @version
 * @see homework3
 */
package dt59homework;

public class Dog1 {
 String name;
 String color;
 int  age;
    public Dog1(String name){
	 this.name=name;
	 System.out.println(name);
 }
     public Dog1(String name,String color){
	 this.name=name;
	 this.color=color;
	 System.out.println(name+color);
 }
 public Dog1(String name,String color,int age){
	 this(name,color);
	 this.age=age;
	 System.out.println(name+color+age);
 }
 

}
