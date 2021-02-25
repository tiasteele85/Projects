/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program to assess what month was entered and convert to or from numeric value, 
* 					Demonstrate custom exceptions
* Input:  Accepts Month Number or Name from user
* Desired Output:  Numeric or String value for month
* Variables and Classes:  Month date; int monthNumber, String monthName; Class Month; Class InvalidNoun, 
* 							Class OutOfBounds
* Formulas:  none
* Description of the main algorithm: Create a program that can convert a numeric value for month
* 									 to a String or convert a String for month to a numeric value. 
* 									 Also demonstrate custom exception classes.
* April 23, 2016
**/


public class ExceptionsDemo {

	public static void main(String[] args) {
		
		try
		{
			Month date = new Month(23);
		}
		catch(OutOfBounds e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidNoun e)
		{
			System.out.println(e.getMessage());
		}

	}

}
