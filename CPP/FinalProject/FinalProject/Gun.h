#include "Weapon.h"



class Gun : public Weapon
{
protected:
	string type;
	int bullets;
	string sound;
	int hits;  //number of hits
	int damage; //amount of damage per hit
public:
	Gun(): Weapon()
	{
		type = " ";
		bullets = 0;
		sound = " ";
		hits = 0;
		damage = 0;
	}
	Gun(string type, int bullets, string sound, int dam, Player *p1):Weapon(dam, p1)
	{
		this->type = type;
		this->bullets = bullets;
		this->sound = sound;
		hits = 0;
		damage = 0;
	}
	Gun(string type, int bullets, string sound, int damage, int dam, Player *p1):Weapon(dam, p1)
	{
		this->type = type;
		this->bullets = bullets;
		this->sound = sound;
		hits = 0;
		this->damage = damage;
	}
	
	void setType(string type)
	{
		this->type = type;
	}
	void setBullets(int bullets)
	{
		this->bullets = bullets;
	}
	void setSound(string sound)
	{
		this->sound = sound;
	}
	void setHits(int hits)
	{
		this->hits = hits;
	}
	void setDamage(int damage)
	{
		this->damage = damage;
	}
	int getDamage()
	{
		return damage;
	}
	int calcDamageReceived(int hits)
	{
		this->hits = hits;
		setDamaged(this->hits * damage);
		return this->hits * damage;
	}
	string getType()
	{
		return type;
	}
	int getBullets()
	{
		return bullets;
	}
	string getSound()
	{
		return sound;
	}
	void fireGun(int num)
	{
		bullets -= num;
		for (int acc = 0; acc < num; acc++)
		{
			cout << sound << endl; 
		}
		cout << "Bullets Left: " <<	bullets << endl;
	}

};
