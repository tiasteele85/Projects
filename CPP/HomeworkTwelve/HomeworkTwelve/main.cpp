#include <iostream>
#include <string>

/**Exercise Homework Twelve
* Author: Tia Steele
* Project Purpose: Program to Display templated stacking class
* Input:  This program does not accept inputs
* Desired Output:  The value being passed into StackTemplate
* Variables and Classes:  class StackTemplate; template class T; StackTemplate<int> stack(5);
	StackTemplate<string> stack2(5);int iTest[];string sTest[];	int WaitForIt;
* Formulas:  none
* Description of the main algorithm: none
*Testing:  none
*April 27, 2017
**/

using namespace std;
template<class T>
class StackTemplate
{
private:
	T *stackArray;
	int capacity;
	int top;
	bool full;
	bool empty;
public:
	StackTemplate()
	{
		capacity = 100;
		stackArray = new T[capacity];
		top = 0;
		full = false;
		empty = true;
	}
	StackTemplate(int capacity)
	{
		this->capacity = capacity;
		stackArray = new T[capacity];
		top = 0;
		full = false;
		empty = true;
	}
	void push(T item)
	{
		if (!full)
		{
			stackArray[top] = item;
			empty = false;
			top++;
		}
		else
			throw Overflow();
	}

	void pop(T &item)
	{
		if (!empty)
		{
			top--;
			item = stackArray[top];
			if (top == 0)
			{
				empty = true;
			}
		}
		else
			throw Underflow();
	}
	class Overflow {};
	class Underflow {};
};

int main()
{
	StackTemplate<int> stack(5);
	StackTemplate<string> stack2(5);
	int iTest[] = { 1,2,3,4,5 };
	string sTest[] = { "Cheese", "Taco", "Crema", "Onion", "Lime"};
	int WaitForIt;

	try
	{
		for (int acc = 0; acc < 5; acc++)
		{
			cout << iTest[acc] << " going in " << endl;
			stack.push(iTest[acc]);
		}
		for (int acc = 0; acc < 5; acc++)
		{
			cout << iTest[acc] << " coming out " << endl;
			stack.pop(iTest[acc]);
		}

	}
	catch (StackTemplate<int>::Overflow)
	{
		cout << "\n An Overflow exception occurred.\n";
	}
	catch (StackTemplate<int>::Underflow)
	{
		cout << "\n An Underflow exception occurred.\n";
	}

	try
	{
		for (int acc = 0; acc < 5; acc++)
		{
			cout << sTest[acc] << " going in " << endl;
			stack2.push(sTest[acc]);
		}
		for (int acc = 0; acc < 5; acc++)
		{
			cout << sTest[acc] << " coming out " << endl;
			stack2.pop(sTest[acc]);
		}

	}
	catch (StackTemplate<string>::Overflow)
	{
		cout << "\n An Overflow exception occurred.\n";
	}
	catch (StackTemplate<string>::Underflow)
	{
		cout << "\n An Underflow exception occurred.\n";
	}

	cin >> WaitForIt;
	return 0;
}