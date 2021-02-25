/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program to calculate total cost of stock purchases
* Input:  This program does not accept inputs
* Desired Output:  With pre-determined values, outputs a subtotal of stock cost,
* 					then displays a commission, cost and then a total.
* Variables and Classes:  int shares, float cost, price, commission, commTotal,
* 							and total, class String
* Formulas:  none
* Description of the main algorithm: system.out.printf is used to display the output of math 
* 									calculations
* January 31, 2016
**/
public class stockCommision 
{

	public static void main(String[] args) 
	{
		// Calculate pre-given values
		//define variables
		int shares = 600; //amount of shares desired
		float cost = (float) 21.77, //cost per share of stock
			  price, //price for stock and amount of shares
		      commission = (float) 0.02, //percentage of broker commision
		      commTotal, //calculate commission amount
		      total; //total cost to user
		
		//Calculate price, commision amount, and total
		price = shares * cost;
		commTotal = price * commission;
		total = price + commTotal;
		
		//Display output for user
		System.out.printf("The total stock price: %8.2f\nThe commission amount: %8.2f"
							+ "\nThe total amount paid: %8.2f", price, commTotal, total);
		
		
	}

}
