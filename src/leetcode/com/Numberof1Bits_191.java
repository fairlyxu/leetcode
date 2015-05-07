package leetcode.com;

public class Numberof1Bits_191 {
    public int hammingWeight(int n) {
    	System.out.println("------------start--------- "+"\n"+n);
    	/*if(n>2147483647)
    		return 1;*/
    	int count = 0;
    	 
    	while(n!=0){
    		if((n&1)==1)
    			count++;
    		n=n>>>1;
    		 
    	}
    	 
    	return count;
        
    }
	public static void main(String[] args) {
		Numberof1Bits_191 nb = new Numberof1Bits_191();
		 System.out.println(nb.hammingWeight((int)2147483648L));
		 System.out.println(-1%2);
		 System.out.println(8>>1);
		 
		  int i = -2;
		  System.out.println((i>>1));
		  System.out.println((i>>>1));
		  System.out.println((-1>>>1)); //变成正数
		  System.out.println((4&01));
	}

}
