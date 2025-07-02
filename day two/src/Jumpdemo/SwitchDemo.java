package Jumpdemo;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput=5;
		
		switch(userInput) {
		
		case 1: System.out.println("Current recharge details");
		break;
		
		case 2: System.out.println("Current recharge expiry");
		break;
		
		case 3: System.out.println("Next offers");
		break;
		

		case 4: System.out.println("Talk to our customer support person");
		break;
		
		
		default:
			System.out.println(userInput + " is not valid input ");
		
		
		}

	}

}
