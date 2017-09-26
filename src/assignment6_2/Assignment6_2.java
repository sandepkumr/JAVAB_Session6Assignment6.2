
/**
 * Java program to demostrate negative age exception
 */
package assignment6_2;
import java.util.Scanner;

/**
 * NegativeAgeException class
 * @author Sandeep
 *
 */
class NegativeAgeException extends Exception { 	// Class to create custom exception

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NegativeAgeException(String msg) {			// Overloading constructor with custom message
		super(msg);								// Parent constructor
	}
	
}

/**
 * Age class to check if age is negative
 * @author Sandeep
 *
 */
class Age {										// Class age , to throw custom exception if age is negative
	
	static void age(int age) throws NegativeAgeException { //Method age to check age is negative and throw exception
		if (age<0) {							// if Age less than 0
			throw new NegativeAgeException("Age is "+age+". Age cannot be negative."); // throw negative Age exception
		}
	}
}

/**
 * Class to demostrate exception when age is negative
 * @author Sandeep
 *
 */
public class Assignment6_2 {					// Class to demostrate negative age exception from user input	

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NegativeAgeException  {	// main method start
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);							// Creating object for scanner to take user input
		
		System.out.println("Enter age:");									// Print message to enter age
		int age = scanner.nextInt();										// Assigning age to local variable
		
		try { // try block
			Age.age(age);													// Check the age with age method	
			System.out.println("Age is Ok");								// Print message Age is Ok
		}
		catch (NegativeAgeException ageException) { // catch block
			
			ageException.printStackTrace();									// Print full message about exception
		}
		
		scanner.close();													// closing scanner object
		

	}

}// class closed
