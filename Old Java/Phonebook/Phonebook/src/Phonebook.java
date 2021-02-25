/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program to demonstrate ArrayList
* Input:  Accepts Data for 5 phonebook entries
* Desired Output: Arraylist of class entries
* Variables and Classes:  String name, phone; ArrayList of class Phonebook
* Formulas:  none
* Description of the main algorithm: Create a program that can accept a custom class and store data
* 									 in an ArrayList.
* April 17, 2016
**/

import java.util.ArrayList;

public class Phonebook 
{
	private String name;
	private String phone;
	
	public Phonebook() 
	{
		// No aurgument constructor
		name =" ";
		phone = " ";
	}
	public Phonebook(String n, String p)
	{
		name = n;
		phone = p;
	}
	
	public void setName(String n)
	{
		name = n;
	}

	public void setPhone(String p)
	{
		phone = p;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	
	public static void main(String[] args) 
	{
		// Create 5 phonebook entries and display
		
		ArrayList<Phonebook> friends = new ArrayList<Phonebook>();
		
		//Add phonebook entries
		friends.add(new Phonebook("Jessie", "313-867-5309"));
		friends.add(new Phonebook("Annabell", "248-867-5309"));
		friends.add(new Phonebook("Max", "734-876-5309"));
		friends.add(new Phonebook("Alejandra", "586-867-5309"));
		friends.add(new Phonebook("Maxine", "321-987-6543"));
	
		//Display entries
		for(int count = 0; count < friends.size(); count++)
		{
			Phonebook entries = (Phonebook)friends.get(count);
			System.out.println("Entry Index " + count);
			System.out.println(entries.getName());
			System.out.println(entries.getPhone());
		}

	}

}
