/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午8:32:38 <br/>
 * @author   xiang.li
 * @version
 * @see
 */
package dt59homework;

import java.util.Scanner;

public class VIP {
	
	 Scanner p=new Scanner(System.in);
	   double sum;
	 double zhizun;
       double zuanshi;
      double bojing;
      double huangjing;
      double baiying;
      double x;
      double p1;
      public int show(int x) {
    	  System.out.println("请您选择段位");
    	  String  j=p.next();
    	  
    	    if(j.equals("zhizun")){
    	    	sum=x*0.75;
    	    }
    	    	else if(j.equals("zuanshi")){
        	    	sum=x*0.8;}
    	    	else	if(j.equals("bojing")){
        	    	sum=x*0.85;}
    	    	else if(j.equals("huangjing")){
        	    	sum=x*0.9;}
    	    	else	if(j.equals("baiying")){
        	    	sum=x*0.95;
    	    	}
    	    	 
    	    	  
    	    
			System.out.println(sum);
    	    
			return x; 
		
    	    

		
	
	
      
      }



}