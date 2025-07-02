package SecondPackage;

import FirstPackage.Base;


public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Base b1 = new Base();
		
		//private, default , protected and public 
		
		b1.methodPublic();
		b1.varPublic=34567;
		b1.methodPublic();

	}

}
