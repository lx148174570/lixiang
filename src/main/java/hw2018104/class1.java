/**
 * Description:   <br/>
 * Date:     2018年1月4日,下午4:14:38 <br/>
 * @author   xiang  li
 * @version
 * @see
 */
package hw2018104;


	/*	1，存储。
		StringBuffer append():将指定数据作为参数添加到已有数据结尾处。
		StringBuffer insert(index,数据):可以将数据插入到指定index位置。


	2，删除。
		StringBuffer delete(start,end):删除缓冲区中的数据，包含start，不包含end。
		StringBuffer deleteCharAt(index):删除指定位置的字符。
		
	3，获取。
		char charAt(int index) 
		int indexOf(String str) 
		int lastIndexOf(String str) 
		int length() 
		String substring(int start, int end) 
	 
	4，修改。
		StringBuffer replace(start,end,string);
		void setCharAt(int index, char ch) ;


	5，反转。
		StringBuffer reverse();
	 
	6，
		将缓冲区中指定数据存储到指定字符数组中。
		void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
*/
	class Demo
	{
	}

	class class1
	{
		public static void main(String[] args) 
		{
			//method_update();

			StringBuilder sb = new StringBuilder("abcdef");
		
			char[] chs = new char[6];


			sb.getChars(1,4,chs,1);//将

			for(int x=0; x<chs.length; x++)
			{
				sop("chs["+x+"]="+chs[x]+";");
			}

			draw(3,6);
			draw(8,9);

		}
		public static void method_update()
		{
			StringBuffer sb  = new StringBuffer("abcde");
			sb.setCharAt(2,'k');


			sop(sb.toString());
		
		}
		public static void method_del()
		{
			StringBuffer sb  = new StringBuffer("abcde");
			
//			sb.delete(1,3);
			//清空缓冲区。
			//sb.delete(0,sb.length());

			//sb.delete(2,3);
			sb.deleteCharAt(2);

			sop(sb.toString());
		}

		public static void method_add()
		{
			StringBuffer sb = new StringBuffer();

			sb.insert(1,"qq");
			sop(sb.toString());//abctrue34
			//sop(sb1.toString());

			
		}

		
		public static void sop(String str)
		{
			System.out.println(str);
		}
		
		public static void draw(int row,int col)
		{
			StringBuilder sb = new StringBuilder();
			for(int x=0; x<row; x++)
			{
				for(int y=0; y<col; y++)
				{
					sb.append("*");
				}
				sb.append("\r\n");
			}

			sop(sb.toString());
		}



	}


