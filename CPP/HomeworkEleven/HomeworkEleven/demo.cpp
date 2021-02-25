#include "LinkedList.h"

int main()
{
	LinkedList trial;
	LinkedList trial2;
	int WaitForIt;


	trial.add(7.0);
	trial.add(14.0);
	trial.add(15.0);

	trial2 = trial;

	trial.print();
	cout << endl;

//	cout << "Next" << endl;

	//trial2.add(2.0);
    trial2.print();

	
	


	cin >> WaitForIt;
	return 0;
}