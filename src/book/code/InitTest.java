package book.code;

 class Sub {
	  
	public Sub(int a){
		System.out.println("构造器 ");
		 //this.a=a;
	}
	 
 }
public class InitTest {
    static int a = 0;
	public InitTest(int a){
		System.out.println("构造器 ");
		 //this.a=a;
	}
	static{
		System.out.println("非静态初始块");
		a = 2 ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitTest t = new InitTest(3);
		System.out.println(t.a);
	}

}
