package dt59homework;

public class Snack1 {
String name;
int  age;
String color;
void eat(){
	System.out.println("����һֻ����");
}
void play(){
	System.out.println("�ڲݴ�����ˣ");
}

int catchMouse(){
	return  10;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Snack snack;
           snack=new Snack();
           snack.name="С��";
           snack.color="��ɫ";
           snack.age=3;
           int coutn=snack.catchMouse();
           System.out.println("������ֽ�����"+snack.name);
           System.out.println("��˵����ɫ��"+snack.color);
           System.out.println("��������"+snack.age);
           System.out.println("��ץ�����Ч����"+coutn);
           snack.eat();
           snack.play();
	}

}
