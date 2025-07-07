package Overriding;

class Colour{
	
	protected Colour getColour()
	{
		Colour s=new Colour();
		return s;
	}
}
//child class
class Red extends Colour{
	
	protected Red getColour() {
		
		Red s=new Red();
		return s;
	}
}
class Blue extends Colour{
	
	protected Blue getColour() {
		
		Blue s=new Blue();
		return s;
	}
}


public class CoVarientOverriding {

	public static void main(String[] args) {
		
		

	}

}
