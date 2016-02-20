package demo.java.v1c04objectclass;

public class Book {
	public static final String namef;
	public static final int pagef;
	public static final boolean isNewf;
	public static final Boolean isOverf;
	
	
	static{
		System.out.println("static");
		aa();
		namef = "namef";
		pagef = 22;
		isNewf = true;
		isOverf = Boolean.TRUE;
	}
	
	public static String name;
	public static int page;
	public static boolean isNew;
	public static Boolean isOver;
	
	public String namei;
	public int pagei;
	public boolean isNewi;
	public Boolean isOveri;
	
	public final String nameif;
	public final int pageif;
	public final boolean isNewif;
	public final Boolean isOverif;
	
	{
		System.out.println("instance block");
		nameif = "namef";
		pageif = 22;

		aaa();
	}
	
	Book(){
		System.out.println("Book");
		isNewif = true;
		isOverif = Boolean.TRUE;
		aaa();
	}
	
	
	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(page);
		System.out.println(isNew);
		System.out.println(isOver);
		
		Book b = new Book();
		
		System.out.println(b.namei);
		System.out.println(b.pagei);
		System.out.println(b.isNewi);
		System.out.println(b.isOveri);
	}
	
	
	public static void aa(){
		System.out.println("aa");
	}

	public void aaa(){
		System.out.println("aaa");
	}
	
}
