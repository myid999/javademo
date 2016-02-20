package demo.java.v1c05extends.EnumTest;
import java.util.*;

/**
 * This program demonstrates enumerated types.
 * @version 1.0 2004-05-24
 * @author Cay Horstmann
 */
public class EnumTest
{  
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
      String input = in.next().toUpperCase();
      Size size = Enum.valueOf(Size.class, input);
      System.out.println("size=" + size);
      System.out.println("abbreviation=" + size.getAbbreviation());
      if (size == Size.EXTRA_LARGE)
         System.out.println("Good job--you paid attention to the _.");      
   }
}

enum Size
{
   SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

   private Size(String abbreviation) { this.abbreviation = abbreviation; }
   public String getAbbreviation() { return abbreviation; }

   private String abbreviation;
}


enum SizeA implements Runnable{
	SMALL("S", "160"), MEDIUM("M", "165","vvv"), LARGE("L", "170"), EXTRA_LARGE("XL", "175");

	private SizeA(String abbreviation, String height) {
		this.abbreviation = abbreviation;
		this.height = height;
	}
	
	   private SizeA(String abbreviation,String vv,String bb) { this.abbreviation = abbreviation; }	

	public String getAbbreviation() {
		return abbreviation;
	}

	public String getHeight() {
		return height;
	}

	private String abbreviation;
	private String height;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	private int size;
}
