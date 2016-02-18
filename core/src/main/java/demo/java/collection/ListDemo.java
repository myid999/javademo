package demo.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	private List<String> arrayList = new ArrayList<String>();
	
	private List<String> linkedList = new LinkedList<String>();
	
	public ListDemo() {
		for(int i=10;i>0;i--){
			arrayList.add("String - "+i);
		}
		
		for(int i=10;i>0;i--){
			linkedList.add("String - "+i);
		}
	}
	
	
	
	
	
	
	
}
