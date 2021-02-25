/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program to assess monthly banking account fees based on check usage.
* Input:  Accepts check usage from user
* Desired Output:  Starting balance, fees, ending balance
* Variables and Classes:  double baseFee, checkFee, checksWritten, minBal, balance
* 						totalFees, serviceFee, finBal, String str,
* Formulas:  none
* Description of the main algorithm: Create a program to calculate a monthly fee rate
* 										based on the number of checks written per month.
* March 23, 2016
**/


import javax.swing.JOptionPane;

public class BankFees {

	public static void main(String[] args)
	{
		double  baseFee = 10.00, //Fee changed by bank every month
				checkFee, //varying check fee .10, .08, .06, or .04 currently
				checksWritten,  //number of checks written
				minBal = 400, //current required minimum account balance
				balance,
				totalFees = 0, // accumulated fees
				serviceFee = 15.00, // service fee is account is less than min bal
				finBal; //temp value to hold final balance
		String str;
		
		//starting balance
		balance = 300;
		
				
		//User input for number of check written.
		str = JOptionPane.showInputDialog("Enter the number of check written this month: ");
		checksWritten = Double.parseDouble(str);
		
		
		//check to see if service fee should apply
		if(balance <= minBal)
			{
				totalFees += serviceFee;
				System.out.printf("Your account is below the allowed minimum balance. "
									+ "\nThe service fee is: $%14.2f", serviceFee);
			}
		
		//determine the fees based on number of checks written
		
		if(checksWritten < 20)
			{
				checkFee = .10;
			}
		else if(checksWritten <= 39)
			{
				checkFee = .08;
			}
		else if(checksWritten <= 59)
			{
				checkFee = .06;
			}
		else
			{
				checkFee = .04;
			}
		
		totalFees += baseFee +(checkFee * checksWritten);
		finBal = balance - totalFees;
		
		System.out.printf("\nYour starting balance: $%11.2f\nThe total fees: $%18.2f"
				+ "\nYour balance after fees: $%9.2f", balance, totalFees, finBal);

		
		//reset variables and carry stored balance
		balance = finBal;
		finBal = 0;
		totalFees = 0;
		
System.exit(0);

		
	}

}
