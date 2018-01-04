/**
 * Description:   <br/>
 * Date:     2018年1月4日,下午4:14:38 <br/>
 * @author   xiang  li
 * @version
 * @see
 */
package hw2018104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

public class class4 {
	private final static Logger LOG=Logger.getLogger(class4.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car qingtianzhuCar = new Car("擎天柱","货车");
		Car weizhengtianCar = new Car("威震天","坦克");
		Car dahuangfengCar = new Car("大黄蜂","高级跑车");
		Car batianhuCar = new Car("霸天虎","轿车");
		Car tiepiCar = new Car("铁皮","路虎");
		Map carMap=new HashMap();
		carMap.put(qingtianzhuCar.getName(),qingtianzhuCar);
		carMap.put(weizhengtianCar.getName(),weizhengtianCar);
		carMap.put(dahuangfengCar.getName(),dahuangfengCar);
		carMap.put(batianhuCar.getName(),batianhuCar);
		carMap.put(tiepiCar.getName(),tiepiCar);
		LOG.info("使用Iterator遍历,"+"所有变形金刚的名字和种类分别是:");
		Set keys=carMap.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()){
			String key=(String)it.next();
			Car car=(Car)carMap.get(key);
			LOG.info(key+"\n"+car.getStrain());
		}
			

	}

}
