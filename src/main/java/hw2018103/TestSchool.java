package hw2018103;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月3日,下午3:14:38 <br/>
 * @author   xiang  li
 * @version
 * @see
 */
/*
 * 测试类
 */
public class TestSchool {
	private final static Logger LOG=Logger.getLogger(TestSchool.class);
	public static void main(String[] args) {
		
		School school=new Enghish();
		  LOG.info(school.studen()+","+school.steach());
		School school1=new Mach();
		    LOG.info(school1.studen()+","+school1.steach());
	}

}
