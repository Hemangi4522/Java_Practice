package practice;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
        int no = sc.nextInt();
        System.out.println("Table for "+no);
        for(int i=1; i <= 10; i++)  {
        	System.out.println(no+" * "+i+" = "+no*i);  
        }

	}

}
