#include <iostream>
#include <fstream>
#include <cstring>
#include <string>

/**Exercise Homework 5
* Author: Tia Steele
* Project Purpose: Program to Display file open and close 
* Input:  This program does accept inputs
* Desired Output:  File Input
* Variables and Classes:  int WaitForIt, totalQuantityOnHand; char done; string input; long num;
  double totalWholeCost, totalRetailCost; struct Inventory
* Formulas:  noen
* Description of the main algorithm: none
*Testing:  none
* April 26, 2017
**/

using namespace std;

const int SIZE = 51;
struct Inventory
{
	char description[SIZE];
	int quantityOnHand;
	double wholeCost;
	double retailCost;
	char date[SIZE];

};


int main()
{
	Inventory item;
	char done;
	string input;
	int WaitForIt;
	long num;
	double totalWholeCost = 0;
	double totalRetailCost = 0;
	int totalQuantityOnHand = 0;

	fstream newItem("inventory.dat", ios::in |  ios::out |ios::binary);
	if (!newItem)
	{
		cout << "File opening error.  Ending Program."; 
		cin >> WaitForIt;
		return 0;
	}

	do
	{
		cout << "Select an option: " << endl;
		cout << "1. Add new records to the file \n";
		cout << "2. Display any record in the file \n";
		cout << "3. Change any record in the file \n";
		cout << "Z to quit ";
		cin >> done;
		cin.ignore();

		if (done == '1')
		{
			cout << "Enter the item information: \n";
			cout << "Description: ";
			getline(cin, input);
			strcpy_s(item.description, input.c_str());
			cout << "Quantity on Hand: ";
			cin >> item.quantityOnHand;
			cin.ignore();
			cout << "Wholesale Cost: ";
			cin >> item.wholeCost;
			cin.ignore();
			cout << "Retail Cost: ";
			cin >> item.retailCost;
			cin.ignore();
			cout << "Date: ";
			getline(cin, input);
			strcpy_s(item.date, input.c_str());

			newItem.write(reinterpret_cast<char*>(&item), sizeof item);
		}
		else if (done == '2')
		{
			
			while (!newItem.eof())
			{
				newItem.read(reinterpret_cast<char*>(&item), sizeof item);
				totalQuantityOnHand += item.quantityOnHand;
				totalWholeCost += item.wholeCost;
				totalRetailCost += item.wholeCost;
			}
		}
		else if (done == '3')
		{
			cout << "Which item do you want to change? ";
			cin >> num;
			newItem.seekg(num * sizeof(item), ios::beg);
			newItem.read(reinterpret_cast<char*>(&item), sizeof item);
			cout << "Enter the new item information: \n";
			cout << "Description: ";
			getline(cin, input);
			strcpy_s(item.description, input.c_str());
			cout << "Quantity on Hand: ";
			cin >> item.quantityOnHand;
			cin.ignore();
			cout << "Wholesale Cost: ";
			cin >> item.wholeCost;
			cin.ignore();
			cout << "Retail Cost: ";
			cin >> item.retailCost;
			cin.ignore();
			cout << "Date: ";
			getline(cin, input);
			strcpy_s(item.date, input.c_str());
			newItem.write(reinterpret_cast<char*>(&item), sizeof item);
		} 
		else
		{
			done = 'Z';
		}
		//cout << done; 
	} while ((done != 'Z') || done != 'z');

	newItem.close();
	cin >> WaitForIt;
	return 0;
}

