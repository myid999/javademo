package demo.java.v1c12genericprogramming;

import java.util.ArrayList;
import java.util.List;

public class GpTest {

	public GpTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 List<String> ls = new ArrayList<String>();
		    List<Object> lo =  new ArrayList<Object>();
		   // lo = ls;
		    lo.addAll(ls);

		    
		    //List<Integer>[] iListArray = new ArrayList<Integer>[10];//编译时错误
		    List<Integer>[] iListArrayB = new ArrayList[10];
		    iListArrayB[0] = new ArrayList<Integer>();
		    iListArrayB[0].add(44);
		    
		    
		    
		    List<? extends Integer> ll = new ArrayList<Integer>();
		    
		    //List<Runnable> lcl = new ArrayList<testA>(); //incorrect
		    
		    List<? extends Runnable> lcl = new ArrayList<testA>();
		    List<? extends ArrayList> lccl = new ArrayList<ArrayList>();
		    List<? super ArrayList> lcccl = new ArrayList<ArrayList>();
		    List<?> lccscl = new ArrayList<ArrayList>();
	}

	

	
	
	
	public <T> void f(Class<T> x) {
		System.out.println("sss");
		
		
	}
	
	public  <T> void ff(T x) {
		System.out.println("sss");
		
		
	}
	
	public <T,S> void f2(T x) {
		System.out.println("sss");
		
		
	}	
	
	
	public static <T,S> void f3(T x) {
		System.out.println("sss");
		
		
	}	
	
}



class testA implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}




class testB<T>{

	public void testV(T cc) {
		
	}
	
	public <S> void testVv(S cc) {
		
	}
	
	public <S extends Runnable> void testVv(S cc) {
		
	}	
	
}

class testC<U extends ArrayList>{

	public void testV() {
		
	}
	

	
}


/*class testD<U super ArrayList>{

	public void testV() {
		
	}
	
}*/





