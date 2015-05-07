package leetcode.com;

public class Count_Primes_204 {
	 public int countPrimes(int n) {
	        if(n<3)
	        return 0;
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
		        		//System.out.println(k);
		        		count++;
		        	}
		        }
		        return count;
	    }
}
