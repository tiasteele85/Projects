
public class ShiftSupervisor extends Employee
{
	private double annualSal;
	private double bonus;
	
	public ShiftSupervisor()
	{
		super();
		annualSal = 0;
		bonus = 0;
	}
	
	public ShiftSupervisor(String emp, String num, String date, double a, double b)
	{
		super(emp, num, date);
		annualSal = a;
		bonus = b;
	}
	
	public void setSalary(double a)
	{
		annualSal = a;
	}
	
	public void setBonus(double b)
	{
		bonus = b;
	}
	
	public double getSalary()
	{
		return annualSal;
	}
	
	public double getBonus()
	{
		return bonus;
	}
	
	public String toString()
	{
		String str;
		
		str = (super.toString() +
				"\nAnnual Salary $" + annualSal +
				"\nBonus: $" + bonus);
		
		return str;
	}
}
