package com.tnsif.dayone;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// widening //implicit type casting 
		
		
		byte b=10;
		int i =b;
		System.out.println(i);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		//narrowing //explicit type casting
		
		double f1=10.52f;
		long ll= (long)f1;
		System.out.println(ll);
		
		long i12= 8668525992L;
		System.out.println(i12);
		
		short i13= 130;
		byte m = (byte)i13;
		System.out.println(m);
		

	}

}
