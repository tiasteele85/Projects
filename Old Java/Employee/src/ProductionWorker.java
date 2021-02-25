
public class ProductionWorker extends Employee
{
	private int shift;
	private double payRate;
	
	public ProductionWorker()
	{
		super();
		shift = 1;
		payRate = 1.0;
	}
	
	public ProductionWorker(String emp, String num, String date, int s, double p)
	{
		super(emp, num, date);
		shift = s;
		payRate = p;
	}
	
	public void setShift(int s)
	{
		shift = s;
	}
	
	public void setPay(double p)
	{
		payRate = p;
	}
	
	public int getShift()
	{
		return shift;
	}
	
	public double getPay()
	{
		return payRate;
	}
	
	public String toString()
	{
		String str;
		
		str = (super.toString() +
				"\nShift: " + shift +
				"\nPay Rate: " + payRate);
		
		return str;
	}
}
