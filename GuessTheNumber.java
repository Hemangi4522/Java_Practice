package practice;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter a number between 1 to 100 : ");
		int genNo= 50;
		int g= 5;
		int guess;
		for (int i=0; i<g; i++) {
			System.out.println("Guess the Number :");
		guess =sc.nextInt();
		 
		if (genNo == guess) {
			System.out.println("Congratulations ! You guessed the number.");
			break;
			}
		
			else if (genNo > guess && i !=g -1) {
				System.out.println("The number is greater than "+ guess);			
				
			}
			else if (genNo < guess && i !=g -1) {
				System.out.println("The number is less than"+ guess);			
				
			}
		if (i== g)
		{
			System.out.println("you are running out of guessing chances");
			System.out.println("The number was "+genNo);
		}
		if (guess > 100) {
			System.out.println("Please ,Enter a number between 1 to 100!");
		}
		
		
		}
		
		
		
		
	}

}
