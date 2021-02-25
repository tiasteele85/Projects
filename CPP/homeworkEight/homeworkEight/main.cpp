#include "Encryption.h"
#include "SimpleEncryption.h"

/**Exercise Homework 8
* Author: Tia Steele
* Project Purpose: Encrypt user file
* Input:  This program does allow file name input
* Desired Output:  output file data
* Variables and Classes:  classes Encryption, SimpleEncryption; char inFileName, outFileName; ifstream inFile;
	ofstream outFile; int encryptKey, keyIt, WaitForIt;
* Formulas:  take chars from user file and add to key
* Description of the main algorithm: none
*Testing:  none
* April 26, 2017
**/

int main()
{
	char inFileName[80], outFileName[80];
	int keyIt;
	int WaitForIt;

	cout << "Enter name of file to encrypt: ";
	cin >> inFileName;
	cout << "Enter name of file to receive "
		<< "the encrypted text: ";
	cin >> outFileName;
	cout << "Enter integer for key: ";
	cin >> keyIt;
	SimpleEncryption obfuscate(inFileName, outFileName, keyIt);
	obfuscate.encrypt();

	cout << "Enter name of file to decrypt: ";
	cin >> inFileName;

	SimpleEncryption rewind(outFileName, inFileName, -keyIt);
	rewind.encrypt();

	cin >> WaitForIt;
	return 0;
}