package practice;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number between 1 to 100 : ");
		
		Random ran =new Random();
		int genNo = ran.nextInt(100);
		//System.out.println(genNo);
		int chance = 5;
		int guess;

		for (int i = 0; i < chance; i++) {
			System.out.println("Guess the Number :");
			guess = sc.nextInt();

			if (genNo == guess) {
				System.out.println("Congratulations ! You guessed the number.");
				break;
			}

			else if (genNo > guess && i != chance - 1) {
				System.out.println("The number is greater than " + guess);

			} else if (genNo < guess && i != chance - 1) {
				System.out.println("The number is less than " + guess);

			}
			if (i == chance) {
				
				System.out.println("The number was " + genNo);
			}
			if (guess > 100) {
				System.out.println("Please ,Enter a number between 1 to 100!");
			}

		}

	}

}
