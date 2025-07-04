package StaticMethod;

public class MyClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass.display();
		
		System.out.println();
		
		MyClass o1=new MyClass();
		System.out.println(o1);
		
		MyClass.display();
		
		System.out.println();
		
		MyClass o2=new MyClass();
		System.out.println(o2);
		

	}

}
