package StaticMethod;

public class MyClass {
	
	private int section;
	private static int srNo;
	
	//static block
	static
	{
		System.out.println("----------wuthin static bloc-------------");
		srNo=1000;
	
	
	}
	
	//defualt construct

	public MyClass() {
		
		System.out.println("withiv defualt");
		srNo++;
		section++;
		
	}

	@Override
	public String toString() {
		return "Myclass [serial no  " +srNo+ " section=" + section + "]";
	}
	
	//static method
	static void display() {
		System.out.println("Serial no"+srNo);
	}
	

}
