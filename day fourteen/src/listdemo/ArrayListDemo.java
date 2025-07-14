package listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list=new ArrayList();
		System.out.println(list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add("Samruddhi");
		list.add("sakshi");
		list.add(false);
		list.add(true);
		list.add(20);
		list.add(20.4f);
		list.add(10);
		
		System.out.println("List is"+ list) ;
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.size());
		
		System.out.println(list.contains(10));
		
		System.out.println(list.remove(2));
		
		System.out.println(list.remove(list.lastIndexOf(20)));
		
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		//generics
		
		List<String> names=new ArrayList<String>();
		names.add("heti");
		names.add("hema");
		names.add("adi");
		names.add("jay");
		names.add("adi");
		names.add("akshay");
		
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		System.out.println(names.contains("dilip"));
		
		Collections.sort(names);
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		//traversing in a list
		
		Iterator<String> i=names.iterator();
		while(i.hasNext())
		{
			String nm=i.next();
			System.out.println(nm+"");
		}
		//second method of iteration
		
		ListIterator<String>li=names.listIterator(names.size());
		while(li.hasPrevious())
		{
			String nm=li.previous();
			System.out.println(nm);
		}

	}

}
