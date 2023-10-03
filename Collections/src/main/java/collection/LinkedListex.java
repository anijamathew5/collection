package collection;

import java.util.*;

public class LinkedListex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj=new LinkedList();
		obj.add(1);
		obj.add("anija");
		obj.add(10.2f);
		System.out.println(obj);
		obj.addFirst(5);
		System.out.println(obj);
		obj.addLast("Mathew");
		System.out.println(obj);
		System.out.println(obj.indexOf("anija"));
		System.out.println(obj.contains(5));
		System.out.println(obj.peekFirst());
		System.out.println(obj);
		System.out.println(obj.peekLast());
		System.out.println(obj);
		System.out.println(obj.pollFirst());
		System.out.println(obj);
		System.out.println(obj.pollLast());
		System.out.println(obj);
		

	}

}
