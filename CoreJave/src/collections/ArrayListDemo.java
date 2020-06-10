package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list= new ArrayList<String>();
		//insert the element into Arraylist
		list.add("Hello");
		list.add("I");
		list.add("am");
		list.add("Java learner");
		System.out.println(list);
		//Null Allowed
		list.add(null);
		list.add(4, "Sandip");
		System.out.println(list);
		//Duplicate allowed
		list.add(6,"Sandip");
		System.out.println(list);
	}

}
