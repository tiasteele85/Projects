/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Calculate available rooms in varying sized hotels
* Input:  Accepts number of floors, rooms on each floor and occupied rooms from user
* Desired Output:  Total rooms, total rooms occupied, total rooms open and % of occupancy
* Variables and Classes:  int floors, count, double totalOpen, TotalOcupado, ocupado
* 							open, num, rooms, occRate, String str, str2, str3
* Formulas:  none
* Description of the main algorithm: Create a program to tally the number of rooms, rooms available,
* 									and rooms occupied.  Also calculate an occupancy rate based on 
* 									data given. 
* March 23, 2016
**/


import javax.swing.JOptionPane;

public class HotalOcc 
{
	public static void main(String[] args)
	{	
		int floors,  //user entered value for number of floors
			count = 0;  //measure count against user entry
		double totalOpen = 0, //accumulated value of open rooms
			   totalOcupado = 0,  //accumulated value for occupied rooms
				ocupado= 0, // user entered occupancy, temp value
				open = 0,  //calculated value for available rooms, temp value
				num, //user entered value for rooms on each floor, temp value
				rooms = 0,  //accumulated value for rooms
				occRate = 0; //calculated based on totals for all floors and rooms
		String str, //temp value for string conversion
			   str2, //temp value for string conversion
			   str3; //temp value for string conversion
		
		
		str = JOptionPane.showInputDialog("Enter the number of floors: ");
		floors = Integer.parseInt(str);
		while  (floors < 1)
		{
			JOptionPane.showMessageDialog(null, "A hotel can not have less than 1 floor. ");
			str = JOptionPane.showInputDialog("\nEnter the number of floors: ");
			floors = Integer.parseInt(str);
		}
		while (count < floors)
		{
			str2 = JOptionPane.showInputDialog("Enter the number of rooms on this floor: " + (count +1));
			num = Double.parseDouble(str2);
			while (num < 10)
			{
				JOptionPane.showMessageDialog(null, "This hotel cannot have less than 10 rooms per floor.");
				str2 = JOptionPane.showInputDialog("\nEnter the number of rooms on this floor: ");
				num = Double.parseDouble(str2);
			}
			rooms += num;
			str3 = JOptionPane.showInputDialog("Enter the number of rooms currently occupied: ");
			ocupado = Double.parseDouble(str3);
			while (ocupado > num)
			{
				JOptionPane.showMessageDialog(null, "You cannot have more rooms occupied than on the floor.");
				str3 = JOptionPane.showInputDialog("\nEnter the number of rooms currently occupied: ");
				ocupado = Double.parseDouble(str3);
			}
			open = num - ocupado;
			totalOpen += open;
			totalOcupado += ocupado;
			
			//value resets for next loop
			num = 0;
			open = 0;
			ocupado = 0;
			count ++; 
		}
		occRate = totalOcupado/rooms;
		
		System.out.printf("Total rooms in the hotel: %5.0f\nTotal rooms occupied: %9.0f" 
						  + "\nTotal rooms open: %13.0f\nOccupancy Rate: %15.2f",
						  + rooms, totalOcupado, totalOpen, occRate);

System.exit(0);
		
		
	}
	
}
