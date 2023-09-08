package Encapsulation;

import java.util.Scanner;

public class EncapsulationEmployee {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Emp2 emp2=new Emp2();
		
		System.out.println("Enter Your Salary: ");
		emp2.setEmployee_salary(input.nextDouble());
		
		System.out.println("Enter your Id: ");
		emp2.setEmployee_id(input.next());
		
		input.nextLine();
		System.out.println("Enter Your Name: ");
		emp2.setEmployee_name(input.nextLine());
		
		

		System.out.println("Your Details in formatted form \n"+"Employee Id: " +emp2.getEmployee_id()+
				"\nEmployee Name: " +emp2.getEmployee_name()+ "\nEmployee salary : "+emp2.getEmployee_salary() );
	}

		
	

}
class Emp2 {
	private String employee_id;
	private String employee_name;
	private double employee_salary;
	
	//getter methods
	public String getEmployee_id() {
		return employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public double getEmployee_salary() {
		return employee_salary;
	}
	
	
	//Setter methods
	public void setEmployee_id(String employee_id ) {
		this.employee_id= employee_id;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}
	
	
}
