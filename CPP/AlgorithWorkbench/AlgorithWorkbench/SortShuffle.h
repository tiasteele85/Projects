#pragma once

#include <iostream>



using namespace std;

class SortShuffle
{
protected:

public:
	virtual bool compare(int x, int y) = 0;
	void sort(int a[], int size)
	{
		//int j = 0;
		cout << a[0];

		for (int k = 0; k < size -1; k++)
		{
			for (int j = 1; j < size - 1; j++ )
			//j = k + 1;
			if (compare(a[k], a[j]))
			{
				int x;

				x = a[k];
				a[k] = a[j];
				a[j] = x;
			}
		}


	}

};
