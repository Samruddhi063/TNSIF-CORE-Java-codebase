package MultidimensionalDemo;



class MLArray
{
	static void printArray(int c[][]) 
	{
		System.out.println("Array element are as follow");
		for (int i=0; i<=c.length; i++) 
		{
			for(int j=0; j<c.length; j++)
			{
				System.out.println(c[i][j]+"");
			}
			System.out.println();
		}
	}	
}

public class MultidimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c[][]= { {12,34,60},{10,20,30},{1,2},{78,87}};
		System.out.println("no of row in array :"+c.length);
		MLArray.printArray(c);

	}

}
