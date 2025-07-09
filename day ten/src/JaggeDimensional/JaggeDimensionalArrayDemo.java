package JaggeDimensional;

class JaggedArray
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

public class JaggeDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c[][]= {{1,2,3,4}, {10,20,30,40},{20},{1,10}};
		System.out.println("no of row in array :"+c.length);
		JaggedArray.printArray(c);

	}

}
