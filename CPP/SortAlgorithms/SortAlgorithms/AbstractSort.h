#pragma once
#include <iostream>

using namespace std;

class AbstractSort
{
	protected:
		int comps;
	public:
		virtual void sort(int arr[], int size) = 0;
		int compare(int num, int num2)
		{
			comps++;
			if (num > num2)
			{
				return 0;
			}
			else
			{
				return 1;
			}

		}
		AbstractSort()
		{
			comps = 0;
		}
		
};
