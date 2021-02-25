
public class AllowableExpenses 
{
	//defined constants
	private final double MEALS = 37,
						 PARKING = 10,
						 TAXI = 20,
						 LODGING = 95,
						 GAS = .27;
	
	//variables to hold computation
	private double meals,
				   parking,
				   taxi,
				   lodging,
				   gas,
				   days;
	
	AllowableExpenses(double num)
	{	
		//constructor sets all values to zero and imports days
		meals = 0;
		parking = 0;
		taxi = 0;
		lodging = 0;
		gas = 0;	
		days = num;
	}
	
	//calculate amount company reemburses for gas
	public double gasPaid(double m)//import miles and return gas
	{
		gas = m * GAS;
		return gas;
	}
	
	//calculate amount company reemburses for parking
	public double parkingPaid(double p)
	{
		parking = days * PARKING;
		if(parking > p)
		{
			parking = p;
		}
		
		return parking;
	}
	
	//calculate amount company reemburses for meals	
	public double getMeals()
	{
		meals = days * MEALS;
			
		return meals;
	}	
	
	//calculate amount company reemburses for lodging
	public double getLodging(double room)
	{
		lodging = days * LODGING;
		if(lodging > room)
		{
			lodging = room;
		}
		
		return room;
	}
	
	//calculate amount company reemburses for taxi
	public double taxiPaid(double taxiMan)
	{
		taxi = days * TAXI;
		if(taxi > taxiMan)
		{
			taxi = taxiMan;
		}
		
		return taxi;
	}
	
	//calculate the total amount that could have been paid for everything
	public double totalAllowable(double m)
	{
		double total = 0;
		
		
		total += (days * MEALS) + (days * PARKING) + (days * TAXI) +
				(days * LODGING) + (m * GAS);
		return total;
	}
}
