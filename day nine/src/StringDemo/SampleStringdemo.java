package StringDemo;

public class SampleStringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c[]= {'I','n','d','i','a'};
		
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String(c);
		System.out.println(s2);
		
		//concatenation 
		
		String longstr="this is to show"+" how long sentence"+ "\t"+" can be printed";
		System.out.println(longstr);
		
	}

}
