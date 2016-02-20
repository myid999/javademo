package demo.java.v1c05extends;

public class MyTest {

	public MyTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String ... args) {
		System.out.print("ss");
	//	MyTest.test("sss",new String[]{"dd","ddd"});
		MyTest.test(new String[]{"dd","ddd"});
		MyTest.test("sss","ccc");

	}
	
	
	
	public static void test(String ... args) {
		System.out.print("ss");

	}
	

}
