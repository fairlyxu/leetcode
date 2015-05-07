import java.util.Calendar;
import java.util.Date;
import java.lang.System;
/*�õݹ���һ�����������Ԫ��֮��
 * ��չ����ѭ�����Ƚ�
*/

public class Sum_array {
	public static int sum_array_recurion(int a [ ],int n){
		if(n==0)
			return 0;
		else 
			return sum_array_recurion(a ,n-1)+a[n-1];		
	}
	
	public static int sum_array_loop(int a [ ] ){
		int sum = 0;
		for(int i = 0;i<a.length;++i)
			sum+=a[i];
		return sum ;			 
		
	}
	 
	public static void main(String[] args) {
		int[] a =  {1,2,3,4,5};
		int count = 1000;
		  
		long t1 =System.nanoTime();   //��ȡ��ʼʱ��  
		for(int i=0;i<count;++i) 
	    sum_array_recurion(a,5) ;
		   //���ԵĴ����  
		long t2 =System.nanoTime(); //��ȡ����ʱ��  
		System.out.println("�ݹ�����ʱ�䣺 "+(t2-t1)+"ns");   
		
		//long end = System.currentTimeMillis();
 
		long t3 =System.nanoTime(); //��ȡ����ʱ��  
		for(int i=0;i<count;++i) 
	    sum_array_loop(a ) ;
	    long t4 =System.nanoTime(); //��ȡ����ʱ��  
		System.out.println("ѭ������ʱ�䣺 "+(t4-t3)+"ns" );
		 
		 
	}
}