package practice;

	import java.util.Scanner;

	public class DaysInMonth {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numOfDays = 0;
	        String monthName = "abc";

	        System.out.println("Enter Month Number: ");
	        int month = scanner.nextInt();

	        System.out.println("Enter Year: ");
	        int year = scanner.nextInt();

	        switch (month){
	            case 1: monthName = "January";
	                numOfDays = 31;
	                break;
	            case 2: monthName = "February";
	                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
	                    numOfDays = 29;
	                } else {
	                    numOfDays = 28;
	                }
	                break;
	            case 3: monthName = "March";
	                numOfDays = 31;
	                break;
	            case 4: monthName = "April";
	                numOfDays = 30;
	                break;
	            case 5:
	                monthName = "May";
	                numOfDays = 31;
	                break;
	            case 6:
	                monthName = "June";
	                numOfDays = 30;
	                break;
	            case 7:
	                monthName = "July";
	                numOfDays = 31;
	                break;
	            case 8:
	                monthName = "August";
	                numOfDays = 31;
	                break;
	            case 9:
	                monthName = "September";
	                numOfDays = 30;
	                break;
	            case 10:
	                monthName = "October";
	                numOfDays = 31;
	                break;
	            case 11:
	                monthName = "November";
	                numOfDays = 30;
	                break;
	            case 12:
	                monthName = "December";
	                numOfDays = 31;
	        }
	        System.out.println(monthName + " " + year + " has " + numOfDays + " days.");
	    }
	}


