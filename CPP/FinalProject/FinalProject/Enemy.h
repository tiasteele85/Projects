#include "Player.h"

class Enemy : public Player
{
private:
	int spawnLocation;
	unsigned seed;
public:
	Enemy() :Player()
	{
		spawnLocation = 0;
	}
	Enemy(string name, string species, int health) : Player(name, species, health)
	{
		seed = time(0);
		srand(seed);
		spawnLocation = rand() % 4;
	}
	void setSpawn()
	{
		//spawnLocation = spawn;
		seed = time(0);
		srand(seed);
		spawnLocation = rand() % 4;
	}
	int getSpawn()
	{
		return spawnLocation;
	}

};