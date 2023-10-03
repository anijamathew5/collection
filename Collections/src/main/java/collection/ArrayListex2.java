package collection;

import java.util.*;

public class ArrayListex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		System.out.println(obj);
		/*for(int a:obj)
		{
			System.out.println(a);
		}*/
		//System.out.println(obj.indexOf(100));
		//System.out.println(obj.contains(200));
		//System.out.println(obj.remove(1));
		//System.out.println(obj);
		//System.out.println(obj.get(3));
		System.out.println(obj.set(1,5));
		System.out.println(obj);

		

	}

}
