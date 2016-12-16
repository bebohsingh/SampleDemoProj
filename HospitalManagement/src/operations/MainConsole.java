package operations;

import java.util.Scanner;

import objects.Registration;

public class MainConsole 
{
	private Scanner scanner;
	public Registration register;
	//constructor to run a static method
	public MainConsole()
	{
		scanner = new Scanner(System.in);
		register = new Registration();
	}
	
	public void mainMenu()
	{
		displayText("******************************************"+ "\t"+ "******************************************"+"\n"+"**\t\t\t\t\t Welcome \t\t\t\t\t**"+"\n"+"**\t\t\t\t\t\t\t\t\t\t\t**"+"\n"+"******************************************"+"\t"+"******************************************");
		displayText("\n --> Enter 1 for new User Registration. \n --> Enter 2 for existing user.");
		getInput();
	}
	
	//static method to get Starting Input
	public void getInput()
	{
		
		String value = scanner.nextLine();
	    
		switch(value)
		{
		case "1":
			displayText("Welcome new User");
			displayText("\n --> Enter 1 for new patient Registration. \n --> Enter 2 for new Doctor registration. \n --> Enter 3 to navigate back to Main Menu.");
			verifyInputForRegistration();
			break;
		case "2":
			displayText("Welcome existing User");
			break;
		default:
			displayText("you entered wrong value, Please try again");
			getInput();
			break;
		}
	}
	
	public void verifyInputForRegistration()
	{
		String value = scanner.nextLine();
		switch(value)
		{
		case "1": 
			displayText("Enter new Patient Details");
			break;
			
		case "2":
			displayText("Enter new Doctor Details");
			break;
		case "3":
			mainMenu();
			break;
		default:
			displayText("you entered wrong value, Please try again");
			verifyInputForRegistration();
		}
	}
	
	public void inputPatientDetails()
	{
		String fname, lname, gender;
		int age,mobileno;
		
		displayText("Enter Patient's first Name");
		fname=scanner.nextLine();
		displayText("Enter Patient's Last Name");
		lname=scanner.nextLine();
		displayText("Enter Patient's Age");
		age=Integer.parseInt(scanner.nextLine());
		displayText("Enter Patient's gender");
		gender=scanner.nextLine();
		displayText("Enter Patient's Mobile No");
		mobileno=Integer.parseInt(scanner.nextLine());
		register.RegisterPatientDetails(fname, lname, gender, age, mobileno);
		
	}
	
	public static void displayText(String text)
	{
		System.out.println(text);
	}
}
