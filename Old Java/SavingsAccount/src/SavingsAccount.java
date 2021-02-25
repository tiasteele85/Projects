/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program to store a balance for a savings account, calculate monthly interest
* 					and deduct or add from withdrawal and deposits from user.
* Input:  Accepts balance, interest rate, deposit and withdrawal amounts
* Desired Output:  Starting balance, total deposits, total withdrawals, and accrued interest
* Variables and Classes:  double bal, rate, earned , x, y, accD=, accW, int months, count = 0, 
* 						 String str, str2, str3, str4, str5, class SavingsAccount
* Formulas:  none
* Description of the main algorithm: Create a program to calculate a accrued interest on a balance
* 									from a savings account, allowing the user to withdraw and
* 									deposit for a user defined number of months. 
* March 23, 2016
**/

import javax.swing.JOptionPane;

public class SavingsAccount 
{
	private double annInterest; //Annual Interest rate variable
	private double balance; //Balance variable
	
	public SavingsAccount(double b, double i) 
	{
		// Constructor method
		balance = b;
		annInterest = i;
	}
	
	public void withdraw(double w)
	{
		//subtract from balance
		balance -= w;
	}
	public void deposit(double add)
	{
		//add deposit amounts to balance
		balance += add;
	}
	public double calcInterest()
	{
		//return interest calculated for the month and add to balance
		double valueEarned = 0; //local variable to return value of interest only and add to balance
		
		valueEarned = (balance * (annInterest/12));
		balance += valueEarned;
		return valueEarned;
	}
	public double getBalance()
	{
		//return total balance
		return balance;
	}

	public static void main(String[] args)
	{
		double bal, //user entered value for starting balance
			   rate, //user entered interest rate
			   earned = 0, //calculated earned interest on balance
			   x, //temp value used to validate data and as a variable to pass - deposit
			   y, //temp value used to validate data and as a variable to pass - withdrawal	
			   accD = 0, //deposit accumulator
			   accW = 0; //withdrawal accumulator
		int months, //amount of months, user defined
			count = 0; //accumulator 
			
		String str, //accept user input
			   str2, //accept user input
			   str3, //accept user input
			   str4, //accept user input
			   str5; //accept user input
		//receive user input
		str = JOptionPane.showInputDialog("Enter the account starting balance ");
		bal = Double.parseDouble(str);
		str2 = JOptionPane.showInputDialog("Enter the accounts interest rate in decimal form: ");
		rate = Double.parseDouble(str2);
		str3 = JOptionPane.showInputDialog("Enter the number of months that have passed since " +
											"\naccount was opened: ");
		months = Integer.parseInt(str3);
		
		//Create object for account
		SavingsAccount acct1 = new SavingsAccount(bal, rate);
		
		//enter loop
		while (count < months)
		{
			//Loop allows user to add and subtract from the balance through methods to class
			//prompt user for deposit and call class method
			str4 = JOptionPane.showInputDialog("Did you make a deposit this month " + (count + 1) +
												"\n If not enter 0: ");
			x = Double.parseDouble(str4);
			if (x > 0)
			{
				acct1.deposit(x);
				accD += x;
			}
			
			//prompt user for withdrawal and call class method
			str5 = JOptionPane.showInputDialog("Did you make a withdrawal this month " + (count + 1) +
												"\n If not enter 0: ");
			y = Double.parseDouble(str5);
			if (y > 0)
			{
				acct1.withdraw(y);
				accW += y;
			}
			//calculate monthly interest
			earned += acct1.calcInterest();
			
			//reset temporary values for next run
			x = 0;
			y = 0;
			count++;
		}
		//display user values
		System.out.printf("Total Ending Balance: %11.2f\nTotal amount deposited: %9.2f" 
				  + "\nTotal amount withdrawn: %9.2f\nTotal Earned Interest: %10.2f",
				  + acct1.getBalance(), accD, accW, earned);
		
		
		System.exit(0);
		
	}
	
}
