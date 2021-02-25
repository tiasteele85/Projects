#include "Encryption.h"

Encryption::Encryption(char *inFileName, char *outFileName, int key)
 {
	inFile.open(inFileName);
	outFile.open(outFileName);
	if (!inFile)
		{
		cout << "The file " << inFileName
			<< " cannot be opened.";

		//cout << "\n\n\nTaco";
		exit(1);
		 }
	if (!outFile)
		{
		cout << "The file " << outFileName
			<< " cannot be opened.";
		
		exit(1);
		}
	encryptKey = key;
	}


Encryption::~Encryption()
{
	inFile.close();
	outFile.close();
}



void Encryption::encrypt()
{
	char ch;
	char transCh;
	inFile.get(ch);
	while (!inFile.fail())
		{
			transCh = transform(ch);
			outFile.put(transCh);
			inFile.get(ch);
		}
}

void Encryption::setEncryptKey(int key)
{
	encryptKey = key;
}

int Encryption::getEncryptKey()
{
	return encryptKey;
}
