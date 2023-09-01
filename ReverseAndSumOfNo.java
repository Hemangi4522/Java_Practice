package practice;

import java.util.Scanner;

public class ReverseAndSumOfNo {
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a Number: ");
	        int no = sc.nextInt();
	      int rev = 0, sum = 0;
	      int rem;
	      
	      do {
	         rem = no % 10;
	         rev = rev * 10 + rem;
	         sum = sum + rem;
	         no = no / 10;
	      }
	      while (no > 0);
	      System.out.println("Reverse of the given number is : " + rev);

	      System.out.println("Sum of digits of the given number is: " + sum);
	   }
	}

