package overloading;

public class OverLadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p=new Point();
		System.out.println(p);
		
		Point p1=new Point(20.09f,23.45f);
		System.out.println(p1);
		
		System.out.println("-----MethodOverLoading-----");
		System.out.println(MethodOverLoading.addition(3.14f,23.67f));
		System.out.println(MethodOverLoading.addition(2,4,5));

	}

}
