/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Demonstrate character insertion
* Input:  Accepts string from user without proper sentence structure
* Desired Output: Sentence with proper spacing
* Variables and Classes:  String accept, int position, Scanner keyboard, StringBuilder str,
* 						  char resize;
* Formulas:  none
* Description of the main algorithm: Create a program that can add spaces in a sentence when each word has an uppercase.
* April 17, 2016
**/

import java.util.Scanner;

public class WordSeparator {

	public static void main(String[] args) 
	{
		// Program to accept user string and separate into proper sentence
		StringBuilder str = new StringBuilder();
		String accept;
		int position = 1;
		Scanner keyboard = new Scanner(System.in);
		
		//Request user input
		System.out.println("Enter a sentence. No spaces but each new word" +
						   " as a capital letter. Then I will format it.");
		accept = keyboard.nextLine();
		str.append(accept);
		
		//Test Values
		while(position <str.length())
		{
			if(Character.isUpperCase(str.charAt(position)))
			{
				char resize;
				
				resize = Character.toLowerCase(str.charAt(position));			
				str.setCharAt(position, resize);
				str.insert(position, " ");
			}
			position++;
		}
		
		//print results
		System.out.println("The new sentence is: ");
		System.out.println(str);
	}

}
