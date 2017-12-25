/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午8:14:38 <br/>
 * @author   xiang.li
 * @version
 * @see
 */
package dt59homework;

public class Max { 
			 public static void main(String[] args) {
			  int a=1,b=2,c=3,MAX=0;
			  MAX=big.max(a,b);
			  MAX=big.max(MAX,c);
			  System.out.println(MAX);//输出最大值
			 }
			} 

			class big{
			 public static int max(int a,int b){
			    return a>b?a:b;//三元
			   }
			
	}


