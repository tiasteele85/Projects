#pragma once
#include <iostream>
#include <fstream>

using namespace std;

class Encryption
{
protected:
	ifstream inFile;
	ofstream outFile;
	int encryptKey;
public:
	Encryption(char *inFileName, char *outFileName, int key);
	~Encryption();	
	virtual char transform(char ch) const = 0;	
	void encrypt();
	void setEncryptKey(int key);
	int getEncryptKey();
};