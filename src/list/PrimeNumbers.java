package list;
 
import java.util.ArrayList;
 

public class PrimeNumbers {
	public static boolean primeNum(int n){
		for(int i=2;i<n;i++){
			if(n%i==0){
				//System.out.println( i);
				//System.out.println(n%i);
				return false ;	   
			}
		}
		return true;
	}
	
	 public static int countPrimes(int n) {
	        int count = 0;
	        boolean flag[] = new boolean[n]; //标记是否划去
	        flag[2] = false;
	        for(int i=3;i<n;i++){
	        	if(i%2==0) 
	        		flag[i]=true;
	        	else 
	        		flag[i] = false ;
	        }
	        
	        for(int i = 3;i<n;i++){
	        	if(!flag[i]){
	        		if(i*i>n)
	        			break;
	        		for(int j=2;i*j<n;++j)
	        		{
	        			flag[i*j]=true;
	        		}	        		
	        	}
	        		
	        }
	        for(int k=2;k<n;k++){
	        	if(!flag[k]){	        		 
	        		count++;
	        	}
	        }
	        return count;
	    }
	public static void main(String arg[])  {
		 System.out.println(countPrimes(20));
		 
	}

}
