
#include "AbstractSort.h"

class Orderor : public AbstractSort
{
	protected:
		int comp;
	public:
		void sort(int arr[], int size)
		{
			int num = 0;

			for (int acc = 0; acc < size - 1; acc++)
			{
				num = acc + 1;
				if (compare(arr[acc], arr[num]) > 0)
				{
					int x;

					x = arr[acc];
					arr[acc] = arr[num];
					arr[num] = x;
					
				}
			}
		}
		Orderor()
		{
			comp = 0;
		}
		int getComp()
		{
			comp = comps;
			return comp;
		}
};

