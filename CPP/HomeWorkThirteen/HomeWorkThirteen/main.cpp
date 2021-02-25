#include <iostream>
#include <stack>
#include <string>

/**Exercise Homework Thirteen
* Author: Tia Steele
* Project Purpose: Program to verify matching parantheses
* Input:  This program does accept inputs
* Desired Output:  Whether matching parantheses were found
* Variables and Classes:  int validCount, WaitForIt; string str; char ch, ch2; stack<char> charStack;
* Formulas:  none
* Description of the main algorithm: none
*Testing:  none
* April 27, 2017
**/

using namespace std;

int main()
{
	
	stack<char>charStack;
	string str;	
	int validCount = 0;
	int WaitForIt;

	cout << "Enter balanced string: ";
	getline(cin, str);

	char ch;
	char ch2;

	for (int acc = 0; acc < str.length(); acc++)
	{
		ch= str.at(acc);
		charStack.push(str.at(acc));
		if (ch == '(')
		{
			validCount++;
			for (int count = 1; count < str.length(); count++)
			{
				ch2 = str.at(count);
				if (ch2 == ')')
					validCount++;
			}
		}
	}
	if (validCount % 2 == 0)
	{
		cout << "String is balanced. " << endl;
		cout << str;
	}
	else
	{
		cout << "String is not balanced." << endl;
		cout << str;
	}
	validCount = 0;

	cin >> WaitForIt;
	return 0;

}

