
public class PartTimeStudent extends Student 
{
	private String employer;

	public PartTimeStudent(String pname, double pgpa, String pemployer) 
	{
		super(pname, pgpa);
		this.employer = pemployer;
	}

	public void setEmployer(String pemployer) 
	{
		this.employer = pemployer;
	}
	
	public String getEmployer() 
	{
		return employer;
	}

}
