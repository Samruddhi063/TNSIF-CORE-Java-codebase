package QueueDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> deque1=new ArrayDeque<String>();
		deque1.add("Gautami");
		deque1.add("kiran");
		deque1.add("sammy");
		deque1.add("niki");
		
		System.out.println(deque1);
		System.out.println( );
		
		deque1.pollLast();
		System.out.println(deque1);
		
		deque1.pollFirst();
		System.out.println(deque1);
		
		for(String str :deque1 )
		{
			System.out.println("queue is:"+ str );
		}
		System.out.println(deque1);

	}

}
