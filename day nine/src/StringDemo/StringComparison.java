package StringDemo;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating string using literals
		
		String s1="TNSIF";
		String s2="TNSIF";
		
		
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		//equals
		
		System.out.println("case 1 :"+ (s1==s2));//true
		System.out.println("case 2 :"+ (s1==s3));//false
		System.out.println("case 3 :"+ (s2.equals(s1)));//true
		System.out.println("case 4 :"+ (s2.equals(s4)));//true
		System.out.println("case 5 :"+ (s3==s4));//false
		System.out.println("case 6 :"+ (s3.equals(s4)));//true
		
		System.out.println("case 7 :"+ (s1.hashCode()));
		System.out.println("case 8 :"+ (s2.hashCode()));
		
		//compare bu using compareTo
		System.out.println(s1.compareTo(s4));
		
		System.out.println(s1.compareToIgnoreCase(s4));
		
		
		
	}
	

}
