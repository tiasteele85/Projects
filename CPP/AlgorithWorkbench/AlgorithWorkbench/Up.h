#include "SortShuffle.h"

class Up: public SortShuffle
{
public:
	virtual bool compare(int x, int y)
	{
		if (x > y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

};
