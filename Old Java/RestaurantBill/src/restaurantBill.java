/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program to accept restaurant bill and calculate tax and tip
* Input:  Accepts meal cost from user with JOptionPane Dialog box
* Desired Output:  Cost of meal, tax amount, tip amount, and total
* Variables and Classes:  float meal, tax, taxAmount, tip, tipAmount, and total, string str ,
* 							class String, JOptionPane
* Formulas:  basic math addition and multiplication
* Description of the main algorithm: system.out.printf is used to display the output and format
* September 4, 2015
**/


//Display message dialog class
import javax.swing.JOptionPane;


public class restaurantBill 
{

	public static void main(String[] args) 
	{
		//Definition of variables
		float  meal,  //user meal input
			   tax = (float) 0.0675, //current tax rate
			   taxAmount, // calculated tax
			   tip = (float) 0.15, //current tip rate 15%
			   tipAmount, //calculated tip
			   total; //total bill
		String str;
		
		//Accept input from user about bill amount
		str = JOptionPane.showInputDialog("Enter the amount of your meal: ");
		meal = Float.parseFloat(str);
		
		//Calculate math
		taxAmount = meal * tax;
		tipAmount = (meal + taxAmount) *tip;
		total = meal + taxAmount + tipAmount;
		
		
				
		//Display output
		System.out.printf("Your meal cost: %11.2f\nYour tax charge: %10.2f\nYour tip amount is: %7.2f"
							+ "\nYour total bill: %10.2f" , meal, taxAmount, tipAmount, total);
	
		System.exit(0);
		
		
		

	}

}
