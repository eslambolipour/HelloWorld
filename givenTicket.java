public class givenTicket{
	public static void main(String args[]) {
	
		int speed = 89;
		boolean birthday = true;
		if(birthday) {
			speed = speed - 5;
		}
		
		
		if(speed <= 60) {
			System.out.println("0");
		}else if(speed > 61 && speed <= 80){
			System.out.println("1");
		}else {
			System.out.println("2");
		}
		
		
	}
}





/* You are driving a little too fast, and a police officer stops you. 
Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases. */


