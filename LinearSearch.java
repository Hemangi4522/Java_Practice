package practice;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int no_Of_El, array[], i, search; // variable Declaration

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements: ");
		no_Of_El = sc.nextInt();// Read the number of elements from the user

		array = new int[no_Of_El];// Create an array to store elements
		System.out.println("Enter those " + no_Of_El + " elements.");

		// Read the elements from the user and store them in the array
		for (i = 0; i <= no_Of_El - 1; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Enter a value You want to search :");
		search = sc.nextInt();// Read the value to search for from the user

		int position = -1;// Initialize the position to -1, indicating not found

		// Search for the value in the array
		for (int j = 0; j < no_Of_El; j++) {
			if (array[j] == search) {
				position = j + 1;
				break;
			}
		}

		// Display the result based on whether the value was found or not
		if (position != -1) {
			System.out.println(search + " is present in the array at position " + position);
		} else {
			System.out.println(search + " is not present in the array.");
		}
	}

}
