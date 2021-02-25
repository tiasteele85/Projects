#include "SortShuffle.h"
#include "Up.h"

/**Exercise Homework 9
* Author: Tia Steele
* Project Purpose: Display pure virtual member function
* Input:  This program does not accept inputs
* Desired Output:  The sorted array is displayed on the screen
* Variables and Classes:  class SortShuffle, Up;
* Formulas:  bubble sort
* Description of the main algorithm: <iostream> cout is used to display the output
*Testing:  When input a is set to 2 and input b is set to 3 output c should show 6.
* April 25, 2017
**/

int main()
{
	Up tester;
	int array[] = { 11, 3, 56, 8 };
	int size;
	int WaitForIt;
	int *prt = &array[0];

	size = sizeof(array);

	tester.sort(prt, size);

	for (int acc = 0; acc < size - 1; acc++)
	{
		cout << array[acc];
	}

	cin >> WaitForIt;
	return 0;
}