package QueueDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class EXQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> r=new LinkedList<Integer>();
		
		r.add(6);
		r.add(10);
		r.add(12);
		r.add(13);
		r.add(2);
		
		System.out.println(r);
		
		int positionPeek=r.peek();
		System.out.println("using peek method first value from queue"+positionPeek );
		
		int positionelement=r.element();
		System.out.println("using peek method first value from queue"+positionelement);
		
		
		System.out.println( );
		
		
		Iterator itr=r.iterator();
		while(itr.hasNext())
		{
			System.out.println( itr.next()+"\t");
		}
		System.out.println( );
		
		System.out.println(r.poll());
		System.out.println(r);
		
		System.out.println(r.retainAll(r));

	}

}
