#include "Encryption.h"


class SimpleEncryption : public Encryption
{
public:
	char transform(char ch) const
	{
		return ch + encryptKey;
	}
	SimpleEncryption(char *inFileName, char *outFileName, int key)
		: Encryption(inFileName, outFileName, key)
	{
	}
};