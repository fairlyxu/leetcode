package book.code;

 class MyBase {
	 int a = 1;
	public MyBase( ){
		System.out.println("MyBase构造器 ");
		a=2;
		 
	}
	public void strTest(){
		 System.out.println("MyBase toString ");
	 }
 }
public class MySub extends MyBase{
    int a = 0;
	public MySub ( ){
		System.out.println("MySub构造器 ");
		a=3;
		 
	}
	 
	 public void strTest(){
		 System.out.println("MySub toString  ");
	 }
	

	public static void main(String[] args) {
		 
		MyBase t = new  MySub( );
		System.out.println(t.a);
		t.strTest();
		System.out.println(t.a);
		System.out.println(t.a);
	}

}
