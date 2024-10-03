
// 2.Cb - import the Scanner class from the util library
	// Bring the Scanner class from utility library

import java.util.Scanner;

// 2.a - Main method with main class

public class Main

{

	public static void main (String[] args)
	
{

// 2.b - In the main method start by printing this message to the user: "Please type your name".
		
		System.out.println("Please type your name");

// 2.Ca - 2.c: Create a Scanner object for reading from the command line
	// System.in - input coming from our command line

		Scanner scanner = new Scanner(System.in);
		
// 2.d - Declare a String variable name and assign to it whatever is returned from a call to scanner's nextLine() method
	//String variable name stores costumers name
		String name = scanner.nextLine();

// 2.e - Print the name of the user in a greeting 
		
		System.out.println("Hello " + name + ". Please type your age. Who cares about age anyway?");

 	// Age converted to a string 

		String age = scanner.nextLine();

// 2.f: Declare another variable of type int called age and assign to it the value returned by the nextInt() method of the Scanner object
	// Converted costumer age to an int so it can be used for calculations

		int i = Integer.parseInt(age);

		System.out.println("You are " + age + " years old. Don't worry you're not that old!");

// 2.h - Declare a third variable of type int. To this variable, assign the calculated number of years until the user can retire. 
	// Calculating how many years left until the costumer retires. Subtracting the costumers current age from 67 which is stored in i
	//	
		int retire = 67 - i;

	// Checking if costumer is over 67, printing a message if current age (i) is over retirement age

		if (i > 67 || 0 > i)
		{
			System.out.println("You are able to - or retired already! Yay!");
		}
			else

	// Now printing a message for users in the required age range

			System.out.println("You have " + retire + "years until retirement. Sucks huh?");



	}
}