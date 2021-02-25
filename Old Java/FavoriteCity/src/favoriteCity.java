/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Accept user's favorite city
* Input:  Accepts input from user.
* Desired Output:  User's favorite city character length, city in all uppercase and lowercase. 
*					Then the first letter of the city.
* Variables and Classes:  int, string, char and String, JOptionPane.
* Formulas:  none
* Description of the main algorithm: JOptionPane is used to receive input and display output.
* September 4, 2015
**/

import javax.swing.JOptionPane;



public class favoriteCity 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// define variables for input data
		int amount;  //integer for length
		String city; //input from user
		String upper; //capitalize input
		String lower; //lowercase input
		char letter; //character isolation of input
		
		//display message for user input
		city = JOptionPane.showInputDialog("What is your favorite city? ");
		
		
		//Variable definitions from data input
		amount = city.length();
		upper = city.toUpperCase();
		lower = city.toLowerCase();
		letter = city.charAt(0);
		
	    //display output for City length, in all uppercase, lower case, and first letter
	   	JOptionPane.showMessageDialog(null, "The length of your city name is: " + amount +
	   										 ". \nYour city in all caps is: " + upper + 
	   										 ". \nYour city in all lowercase is: " + lower +
	   										 ". \nThe first letter of your city is: " + letter);
		
	   	System.exit(0);
	}

}
