/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program to assess what month was entered and convert to or from numeric value, 
* 					Demonstrate custom exceptions
* Input:  Accepts Month Number or Name from user
* Desired Output:  Numeric or String value for month
* Variables and Classes:  int monthNumber, String monthName; Class Month; Class InvalidNoun, Class OutOfBounds
* Formulas:  none
* Description of the main algorithm: Create a program that can convert a numeric value for month
* 									 to a String or convert a String for month to a numeric value. 
* 									 Also demonstrate custom exception classes.
* April 23, 2016
**/

public class Month
{
	private int monthNumber;
	private String monthName;
	
	public Month() 
	{
		//Constructor for no passed arguments
		monthNumber = 1;
		this.setMonthName();
	}
	
	public Month(int num) throws OutOfBounds, InvalidNoun
	{
		//constructor for month numeric value passed by user
		if (num <1 || num > 12)
		{
			throw new OutOfBounds(num);
		}
		else 
		{
			monthNumber = num;
		}
		this.setMonthName();
	}
	
	public Month(String name) throws InvalidNoun
	{
		//Constructor that sets monthNumber from String input
		switch (name)
		{
			case "January":
				monthNumber = 1;
				break;
			case "February":
				monthNumber = 2;
				break;
			case "March":
				monthNumber = 3;
				break;
			case "April":
				monthNumber = 4;
				break;
			case "May":
				monthNumber = 5;
				break;
			case "June":
				monthNumber = 6;
				break;
			case "July":
				monthNumber = 7;
				break;
			case "August":
				monthNumber = 8;
				break;
			case "September":
				monthNumber = 9;
				break;
			case "October":
				monthNumber = 10;
				break;
			case "November":
				monthNumber = 11;
				break;
			case "December":
				monthNumber = 12;
				break;
			default:
				throw new InvalidNoun(name);				
		}
		this.setMonthName();
		
	}

	public void setMonthName()// Set month name for all future calls
	{
		switch (monthNumber)
		{
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
				break;
		}
	}
	
	public void setMonthNumber(int num) throws OutOfBounds, InvalidNoun
	{
		if (num <1 || num > 12)
		{
			throw new OutOfBounds(num);
		}
		else 
		{
			monthNumber = num;
		}
		this.setMonthName(); //sets month name as well
	}
	
	public String toString()
	{
		String str = "The month is: " + monthName + "\nThe numeric value is: "
					+ monthNumber; 
		return str;
	}
	
	public int getMonthNumber()
	{
		return monthNumber;
	}
	
	public boolean equals(Month object2)
	{
		boolean test;
		
		if(this.monthNumber == object2.monthNumber)
		{
			test = true;
		}
		else
		{
			test = false;
		}
		
		return test;
		
	}
	
	public boolean greaterThan(Month object2)
	{
		boolean test;
		
		if(this.monthNumber > object2.monthNumber)
		{
			test = true;
		}
		else
		{
			test = false;
		}
		
		return test;
	}
	
	public boolean lessThan(Month object2)
	{
		boolean test;
		
		if(this.monthNumber < object2.monthNumber)
		{
			test = true;
		}
		else
		{
			test = false;			
		}
		
		return test;
	}
}
