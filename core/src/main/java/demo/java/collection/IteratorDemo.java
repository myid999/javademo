package demo.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class IteratorDemo {

	private static final Logger logger = LogManager.getLogger(IteratorDemo.class);
	
	List<String> sl = new ArrayList<String>();
	
	
	
	public IteratorDemo() {
		for(int i=10;i>0;i--){
			sl.add("String - "+i);
		}
	}



	public void ConcurrentModify() {
		
		ListIterator<String> sli1 = sl.listIterator();
		ListIterator<String> sli2 = sl.listIterator();
		sli1.next();
		sli1.remove();
		sli2.next();
		
		
	}
	
	
	
	public static void main(String[] args) {
		List<String> sl = new ArrayList<String>();
		
		for(int i=10;i>0;i--){
			sl.add("String - "+i);
		}
		
		ListIterator<String> sli1 = sl.listIterator();
		ListIterator<String> sli2 = sl.listIterator();
		sli1.next();
		sli1.remove();
		sli2.next();
		
		
		
		
	}

}
