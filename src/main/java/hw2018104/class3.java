/**
 * Description:   <br/>
 * Date:     2018年1月4日,下午4:14:38 <br/>
 * @author   xiang  li
 * @version
 * @see
 */
package hw2018104;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;



public class class3 {
	private final static Logger LOG=Logger.getLogger(class3.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Map pets=new HashMap();
         pets.put("1","老虎" );
         pets.put("2","小狗" );
         pets.put("3","小猫" );
         pets.put("4","老鼠" );
         pets.put("5","金鱼" );
         String pet=(String) pets.get("3");
         LOG.info("3对应的宠物是:"+pet);
         LOG.info("Map中共有"+pets.size()+"组数据.");
         LOG.info("Map中包含1的key吗？"+pets.containsKey("1"));
         pets.remove("1");
         LOG.info("Map中包含1的key吗？"+pets.containsKey("1"));
         LOG.info(pets.keySet());
         LOG.info(pets.values());
         LOG.info(pets);
         pets.clear();
         if(pets.isEmpty()){
        	 LOG.info("已清空所有数据");
         }
         
         
         
         
	}

}
