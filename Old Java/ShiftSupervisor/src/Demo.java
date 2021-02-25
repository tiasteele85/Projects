/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Demonstrate inheritance of Employee to ShiftSupervisor
* Input:  Production worker class information to draw from superclass
* Desired Output: Information from both Employee class called from ShiftSupervisor class
* Variables and Classes:  ShiftSupervisor supervisor1, Employee class, ShiftSupervisor class.
* Formulas:  none
* Description of the main algorithm: Show relationship between an inherited class and it's super class. 
* April 17, 2016
**/

public class Demo {

	public static void main(String[] args) {
		// Demonstrate Inheritance
				ShiftSupervisor supervisor1 = new ShiftSupervisor("Jane Smith", "032-B", "02/12/2016", +
																	50000.00, 1200.00);
				
				System.out.println("Employee Information: \n" +supervisor1.toString());

	}

}
