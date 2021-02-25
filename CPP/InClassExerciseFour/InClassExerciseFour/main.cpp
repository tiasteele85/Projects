#include <iostream>
#include <fstream>
#include <string>

/**Exercise 4
* Author: Tia Steele
* Project Purpose: Program to Search file for specific string
* Input:  This program does accept inputs
* Desired Output:  How many times and the position of the search string
* Variables and Classes:  int count, WaitForIt; string findIt, name, str, str2; ifstream inputFile; size_t pos;
* Formulas:  none
* Description of the main algorithm: none
*Testing:  none
* Feb 9, 2017
**/

using namespace std;

int main()
{
	ifstream inputFile;
	string findIt;
	string name;
	string str;
	string str2;
	size_t pos;
	int count = 0;
	int WaitForIt;

	cout << "Enter the file name you want to search: ";
	cin >> name;
	inputFile.open(name.c_str(), ios::in);

	if (!inputFile)
	{
		cout << "Bad File. Could Not Open.\n";
		return 0;
	}

	cout << "Enter the string you are looking for in the file: ";
	cin >> str;
	
	
	while (!inputFile.eof())
	{
		getline(inputFile, str2);
		pos = str2.find(str);
		if (pos != string::npos)
		{
			cout << "Found at: " << pos << "\n";
			count++;
		}
	}

	cout << "String found: " << count << endl;

	inputFile.close();
	
	cin >> WaitForIt;

}