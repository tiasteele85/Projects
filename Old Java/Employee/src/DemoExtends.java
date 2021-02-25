/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Demonstrate inheritance of Employee to ProductionWorker
* Input:  Production worker class information to draw from superclass
* Desired Output: Information from both Employee class called from ProductionWorker class
* Variables and Classes:  ProductionWorker employee1, Employee class, ProductionWorker class.
* Formulas:  none
* Description of the main algorithm: Show relationship between an inherited class and it's super class. 
* April 17, 2016
**/

public class DemoExtends {

	public static void main(String[] args) 
	{
		// Demonstrate Inheritance
		ProductionWorker employee1 = new ProductionWorker("John Smith", "001-A", "01/12/2016", +
															1, 12.00);
		
		System.out.println("Employee Information: \n" +employee1.toString());
		
	}

}
