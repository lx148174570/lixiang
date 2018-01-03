/**
 * Description:   <br/>
 * Date:     2018年1月3日,下午3:14:38 <br/>
 * @author   xiang  li
 * @version
 * @see
 */
package hw2018103;

import java.util.Scanner;

import org.apache.log4j.Logger;






public class LogDomr {
	private final static Logger LOG=Logger.getLogger(LogDomr.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		LOG.info("请输入被除数:");
		try{
			int num1=in.nextInt();
		LOG.info("请输入除数:");
		int num2=in.nextInt();
		LOG.info(String.format("%d/%d=%d",num1,num2,num1/num2));
		}catch(Exception x){
      x.printStackTrace();
	}


		 LOG. info("日志输出");
		 
	}

}
