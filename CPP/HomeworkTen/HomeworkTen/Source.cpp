#include <iostream>
#include <vector>
#include <string>

/**Exercise Homework Ten
* Author: Tia Steele
* Project Purpose: Program to Display template classes and vector usage
* Input:  This program does accepts variables from user
* Desired Output:  concantantion of strings and the sum of integers
* Variables and Classes:  template class T; T sum; vector iNums, sText; int num, WaitForIt, SIZE; char str
* Formulas:  vector of strings concatenated and integers sum
* Description of the main algorithm: none
*Testing:  none
* April 26, 2017
**/

using namespace std;

template <class T>
T accum(vector <T> v)
{
	T sum = v[0];
	for (int acc = 1; acc < v.size(); acc++)
	{
		sum += v[acc];
	}

	return sum;
}

int main()
{
	vector<int> iNums;
	vector<string> sText;
	int num;
	int WaitForIt;
	char str[20];
	int SIZE = 3;

	cout << "Enter 3 integers: ";
	for (int acc = 0; acc < SIZE; acc++)
	{
		cin >> num;
		iNums.push_back(num);
	}

	cout << "Enter 3 strings: ";
	for (int acc = 0; acc < SIZE; acc++)
	{
		cin >> str;		
		sText.push_back(str);
		sText.push_back(" ");
	}

	cout << "The sum of your integers was: ";
	cout << accum(iNums) << endl;

	cout << "The sum of your strings: ";
	cout << accum(sText);

	cin >> WaitForIt;
	return 0;
}