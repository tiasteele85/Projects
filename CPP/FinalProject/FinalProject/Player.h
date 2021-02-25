#pragma once

#include <iostream>
#include <string>
#include <ctime>
#include <cstdlib>

using namespace std;

class Player
{
protected:
	string name;
	string species;
	int health;
public:
	Player()
	{
		name = " ";
		species = " ";
		health = 100;
	}
	Player(string pName, string pSpecies)
	{
		name = pName;
		species = pSpecies;
		health = 100;
	}
	Player(string pName, string pSpecies, int pHealth)
	{
		name = pName;
		species = pSpecies;
		health = pHealth;
	}
	void setName(string pName)
	{
		name = pName;
	}
	void setSpecies(string pSpecies)
	{
		species = pSpecies;
	}
	void setHealth(int pHealth)
	{
		if (pHealth < 0)
		{
			health = 0;
		}
		else
		{
			health = pHealth;
		}
	}
	void setAll(string pName, string pSpecies, int pHealth)
	{
		name = pName;
		species = pSpecies;
		health = pHealth;
	}
	string getName()
	{
		return name;
	}
	string getSpecies()
	{
		return species;
	}
	int getHealth()
	{
		if (health < 0)
		{
			health = 0;
		}
		return health;
	}


};

