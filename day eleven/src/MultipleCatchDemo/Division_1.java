package MultipleCatchDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division_1{
	
	public static void divide()
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number :");
		
		try {
			
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a/b;
			
			System.out.println("Division : "+ c);
		}
		catch(InputMismatchException e)
		{
			System.err.println(e.getMessage());
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.err.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.err.println("Exception caught" +e.getMessage());
		}
		finally 
		{
			sc.close();
			
			System.out.println("Finally block ");
		}
	}

}
