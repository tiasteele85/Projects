
public class InvalidNoun extends Exception
{
	public InvalidNoun()
	{
		super("Error: Invalid Month Name.");
	}
	
	public InvalidNoun(String mon)
	{
		super("Error: Invalid Month Name. " + mon + "Please enter month as First Character Uppercase" + 
											"and the following characters lowercase.");
	}
}
