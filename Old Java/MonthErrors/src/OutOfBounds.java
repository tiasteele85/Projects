
public class OutOfBounds extends Exception
{
	
	public OutOfBounds()
	{
		super("Error Invalid Month Selection.");
	}
	
	public OutOfBounds(int month)
	{
		super("Error Invalid Month Selection: " + month);
	}
}
