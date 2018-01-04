/**
 * Description:   <br/>
 * Date:     2018年1月4日,下午4:14:38 <br/>
 * @author   xiang  li
 * @version
 * @see
 */
package hw2018104;

import java.util.LinkedList;

import org.apache.log4j.Logger;

public class class2 {

	private static LinkedList dogs;
	private final static Logger LOG=Logger.getLogger(class2.class);
	public static void main(String[] args) {
		/*
		 * 创建5辆车的变量
		 */
		Car qingtianzhuCar = new Car("擎天柱","货车");
		Car weizhengtianCar = new Car("威震天","坦克");
		Car dahuangfengCar = new Car("大黄蜂","高级跑车");
		Car batianhuCar = new Car("霸天虎","轿车");
		Car tiepiCar = new Car("铁皮","路虎");
        LinkedList<Car> cars=new LinkedList<Car>();
        cars.add(qingtianzhuCar);
        cars.add(weizhengtianCar);
        cars.add( dahuangfengCar);
        cars.add(batianhuCar);
        cars.add(tiepiCar);
        Car carFirst=(Car)cars.getFirst();
        LOG.info("\n共计有"+cars.size()+"个变形金刚"+","+"第一个变形金刚是:"+carFirst.getName()+"。");
        cars.remove(2);
        LOG.info("\n删除后还有"+cars.size()+"个变形金刚。");
            if(cars.contains(dahuangfengCar)){
            	LOG.info("\n集合中包含大黄蜂的信息！");
            }
            else{
            	LOG.info("\n集合中不包含大黄蜂的信息！");
            }
        }
	}


