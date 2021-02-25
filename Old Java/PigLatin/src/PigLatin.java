/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Demonstrate character insertion and rearranging character in StringBuilder
* Input:  Accepts string from user translates to pig latin
* Desired Output: Sentence converted to pig latin
* Variables and Classes:  String accept, int position, start, last, Scanner keyboard, StringBuilder str,
* 						  char resize;
* Formulas:  none
* Description of the main algorithm: Create a program that can convert a sentence into pig latin.
* April 17, 2016
**/

import java.util.Scanner;


public class PigLatin {

	public static void main(String[] args) {
		// Program to convert sentence to pig latin
		StringBuilder str = new StringBuilder();
		String accept;
		int 	position = 0,
				start = 0,
				last = 0;
		Scanner keyboard = new Scanner(System.in);
		
		//Accept sentence
		System.out.println("Enter a sentence to convert to pig latin without periods");
		accept = keyboard.nextLine();			
		
		//split words in sentence
		String[] words = accept.split(" ");
				
		for(int index = 0; index < words.length; index++)
		{
			//convert to StringBuilder and convert words to pig latin
			str.append(words[index]);			
			start = position;
			last = (str.length() - 1);
			str.insert((last+1), str.charAt(start));
			str.insert((last + 2), "ay");
			str.deleteCharAt(start);
			str.append(" ");
			position = (last + 4);
		}
		
		System.out.println(str);
	}

}
