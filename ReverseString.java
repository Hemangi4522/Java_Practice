package practice;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	String myName;
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter Your name to reverse : ");
	myName= input.next();
	
	for(int a=(myName.length())-1; a>=0; a--)
	{
		System.out.print(myName.charAt(a));
	}
}
}
