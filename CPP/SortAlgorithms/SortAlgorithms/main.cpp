#include "AbstractSort.h"
#include "Orderor.h"

/**Exercise Homework 7
* Author: Tia Steele
* Project Purpose: Display Sorting Algorthms
* Input:  no user input
* Desired Output:  Number of sorts needed to order array
* Variables and Classes:  class AbstractSort, Orderor; int comp, comps, WaitForIt, size, makeNums[]; Orderor test;
* Formulas:  bubble sort
* Description of the main algorithm: none
*Testing:  none
* April 26, 2017
**/

int main()
{
	int WaitForIt;
	int makeNums[] = { 6,3,7,12,9,2,7 };
	int size;
	Orderor test;

	size = sizeof(makeNums);

	test.sort(makeNums, size);
	cout << "We compared this many times: " << test.getComp() << endl;

	cin >> WaitForIt;
	return 0;
}