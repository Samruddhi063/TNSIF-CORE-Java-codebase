package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> set=new HashSet<Student>();
		
		set.add(new Student (101,"Shubham", 45.09));
		set.add(new Student (101,"Shubham", 45.09)); //duplicate
		set.add(new Student (102,"Sammy", 55.09));
		set.add(new Student (103,"niki", 65.09));
		set.add(new Student (104,"Shubham", 75.09));
		set.add(new Student (105,"madhura", 85.09));
		
		
		System.out.println(set);
	}

}
