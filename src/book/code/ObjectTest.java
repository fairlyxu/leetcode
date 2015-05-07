package book.code;

public class ObjectTest {
	public static void main(String arg[]){
		Object obj = "123";
		System.out.println("1~~~~~~");
		System.out.println("1~~~~~~"+obj instanceof Object);
		System.out.println("2~~~~~~~~~"+obj instanceof String);
		System.out.println("3~~~~~~~~~~~"+obj instanceof Comparable);
		//Math m = (Math)obj;
		//System.out.println(obj instanceof Math);
	}

}
