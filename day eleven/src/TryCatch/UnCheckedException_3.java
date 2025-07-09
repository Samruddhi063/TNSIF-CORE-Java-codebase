package TryCatch;

public class UnCheckedException_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[];
		try {
			x=new int[] {1,2,3,4,5};  // index till 4
			
			System.out.println(x[3]);  // excdeption 
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e.getMessage());
		}


	}

}
