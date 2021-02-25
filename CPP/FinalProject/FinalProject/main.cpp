#include "Enemy.h"
#include "Gun.h"
#include <fstream>
#include <string>

/**Exercise Final Project
* Author: Tia Steele
* Project Purpose: Program to Display OOP, Inheritance, Arrays, and File Handling
* Input:  This program does accept inputs
* Desired Output:  The choices made by the user in this choice based program
* Variables and Classes:  class Gun, Weapon, Enemy, Player; fstream saveFile;
	string name; int WaitForIt, choice, saveChoice; char ch; Enemy creatures[];
	int const SIZE; Player player1; Gun sizler;
* Formulas:  none
* Description of the main algorithm: none
*Testing:  none
* April 27, 2017
**/

using namespace std;

int main()
{
	fstream saveFile;
	string name;
	int const SIZE = 3;
	Enemy creatures[SIZE];
	int WaitForIt;
	int choice;
	int saveChoice;
	char ch;
						
	
	cout << "Enter Player Name: ";
	getline(cin,name);
	Player player1(name, "Human", 100);
	Gun sizler("Sizler", 10, "Sizzle", 40, 0, &player1);
	for (int acc = 0; acc < SIZE; acc++)
	{
		creatures[acc].setAll("Chula", "Alien", 100);
		
	}


	cout << "Your character starts in a pantry closet clutching a package of bacon to their chest. "
		<< "You wonder how you got here.  Then you remember a news report that hamburger shaped aliens "
		<< "invaders were wreaking havoc and stealing the worlds bacon.  In a frenzy of panic you grabbed you bacon "
		<< "and hid in your pantry. As you come to your senses, you realize you hear rumbling in your refrigerator. "
		<< "What do you do: \n Enter 1 To come out of the pantry. \n Enter 2 To stay in the pantry. \n "
		<< "Enter 99 if you just don't want to play anymore, quiter. ";
	cin >> choice;

	while (choice != 99)
	{
		if (choice == 1)
		{
			saveChoice = choice;
			cout << "\n\nYou slowly open the pantry door. You see a large human sized hamburger rumbling in the fridge "
				<< "on the table you see some sort of gun type item. What do you do: \n Enter 3 To go for the gun. \n "
				<< "Enter 4 To run. " ;
			cin >> choice;
			if (choice == 3)
			{
				saveChoice = choice;
				cout << "\n\nYou grab the gun. The creature comes out of the refridge. What do you do: \n Enter 5 To fire this alien weapon. \n "
					 << " Enter 6 To try to figure out why the Alien is here. "; 
				cin >> choice;
				if (choice == 5)
				{
					saveChoice = choice;
					cout << "\n\nYou decide to toast this 3 piece overload of carbs. You fire the weapon 3 times";
					sizler.fireGun(3);
					creatures[2].setHealth(creatures[2].getHealth() - (sizler.getDamage() * 3));
					if (creatures[2].getHealth() == 0)
					{
						cout << "It's Dead." << endl;
					}
					
					cout << "\n\nThe gun shots have alerted more Aliens. You hear running coming toward the kitchen. Your adrenaline is pumping "
						<< "you are ready to grill some giant burgers. Two more invaders enter the room. You fire that gun over and over until it "
						<< "doesn't shoot anymore. ";

					sizler.fireGun(7);
					creatures[1].setHealth(creatures[1].getHealth() - (sizler.getDamage() * 3));
					creatures[0].setHealth(creatures[0].getHealth() - (sizler.getDamage() * 3));
					if (creatures[1].getHealth() == 0)
					{
						cout << "It's Dead." << endl;
					}
					if (creatures[0].getHealth() == 0)
					{
						cout << "It's Dead." << endl;
					}

					cout << "\n\nYAY you win. You have crushed those bacon stealing oversized sliders.";

					choice = 99;
					
					
				}
				else if (choice == 6)
				{
					saveChoice = choice;
					cout << "\n\nI suppose you have never seen Alien or Predator. SO um yea the giant burger just splits it's buns and eats you.";
					choice = 99;
					
				}
			}
			else if (choice == 4)
			{
				saveChoice = choice;
				cout << "\n\nReally you ran? The creature grabs the gun and fires 3 times. \n";
				for (int acc = 0; acc < 3; acc++)
				{
					cout << sizler.getSound() << endl;
					cout << "You're HIT. "<< endl;
					cout << "Damage Received: "<< sizler.calcDamageReceived(1) << endl;
					cout << "Health: " << player1.getHealth() << endl;
				}
				cout << "You Died." << endl;
				choice = 99;
				
			}
			else
			{
				cout << "That was not one of the options. Try again or loop forever!!!" << endl;
				cin >> choice;
			}
		}
		else if (choice == 2)
		{
			saveChoice = choice;
			cout << "\n\nYou cowry in the closet.  Then you here something getting close to the closet. "
				<< "Next you hear, CHULA IS THE BEEF, the pantry door swings open.  A human sizes hamburger "
				<< "points a gun at you and fires. \n";
			for (int acc = 0; acc < 3; acc++)
			{
				cout << sizler.getSound() << endl;
				cout << "You're HIT. " << endl;
				cout << "Damage Received: " << sizler.calcDamageReceived(1) << endl;
				cout << "Health: " << player1.getHealth() << endl;
			}
			cout << "You Died." << endl;
			choice = 99;
			

		}
		else
		{
			cout << "That was not one of the options. Try again or loop forever!!!" << endl;
			cin >> choice;
		}
	}

	cout << "Do you want to save your file? Enter Y to save: ";
	cin >> ch;
	if (ch == 'Y')
	{
		saveFile.open("save", ios::in | ios::out | ios::binary);
		if (!saveFile)
		{
			cout << "Unable to open saved file. " << endl;
			cin >> WaitForIt;
			return 1;
		}

		saveFile << player1.getName() << endl;
		saveFile << player1.getSpecies() << endl;
		saveFile << player1.getHealth() << endl;
		for (int acc = 0; acc < SIZE; acc++)
		{
			
			saveFile << creatures[acc].getName() << endl;
			saveFile << creatures[acc].getSpecies() << endl;
			saveFile << creatures[acc].getHealth() << endl;
		}
		saveFile << saveChoice << endl;
		if (saveChoice >= 3)
		{
			saveFile << sizler.getType() << endl;
			saveFile << sizler.getBullets() << endl;
			saveFile << sizler.getSound() << endl;
			saveFile << sizler.getDamage() << endl;
		}
		saveFile.close();


	}
	
		
	cin >> WaitForIt;
	return 0;
}