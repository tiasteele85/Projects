#include "Player.h"
//#include "Enemy.h"
#include <iostream>


using namespace std;

class Weapon
{
protected:
	int damaged;
	Player *p1 = new Player[1];
public:
	Weapon()
	{
		damaged = 0;
		p1[0].setAll(" ", " ", 100);
	}
	Weapon(int dam, Player *play)
	{
		damaged = dam;
		p1 = play;
	}
	
	void setDamaged(int damaged)
	{
		this->damaged = damaged;
		sendDamaged();
	}
	void sendDamaged()
	{
		int userHealth = p1[0].getHealth();
		userHealth = userHealth - damaged;
		p1[0].setHealth(userHealth);
	}

};

