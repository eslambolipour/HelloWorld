import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number % 3 == 0 && number % 5 == 0) { 
			System.out.println("FizzBuzz");
			System.exit(0);
		}
		if (number % 3 == 0) {
			System.out.println("Fizz");
		}
		if (number % 5 == 0) {
			System.out.println("Buzz");
		}
		else {
			System.out.print(number);
		}
		input.close();
	}
}
