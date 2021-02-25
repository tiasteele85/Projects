
public class Employee 
{
	private String empName;
	private String empNum;
	private String hireDate;
	
	public Employee()
	{
		empName = " ";
		empNum = "000-A";
		hireDate = "01/01/0001";				
	}
	
	public Employee(String e, String n, String d)
	{
		empName = e;
		if(validID(n))
		{	
			empNum = n;
		}
		else 
		{			
			System.out.println("Invalid ID Number. Default Entered: 000-A");
			empNum = "000-A";
		}
		hireDate = d;				
	}
	
	public void setName(String e)
	{
		empName = e;
	}
	
	public void setNumber(String n)
	{
		if(validID(n))
		{	
			empNum = n;
		}
		else 
		{			
			System.out.println("Invalid ID Number. Default Entered: 000-A");
			empNum = "000-A";
		}
	}
	
	public void setDate(String d)
	{
		hireDate = d;
	}
	
	public String getName()
	{
		return empName;
	}
	
	public String getNumber()
	{
		return empNum;
	}
	
	public String getDate()
	{
		return hireDate;
	}
	
	public String toString()
	{
		String str;
		
		str = ("Employee Name: " + empName +
				"\nEmployee Number: " +empNum +
				"\nStarting Date: " + hireDate);
		return str;		
	}
	
	private boolean validID(String num)
	{
		boolean flag = true;
		int index = 0;
		
		while(flag && index < 4)
		{
			for(int count = 0; count < 3; count++)
			{
				if(!Character.isDigit(num.charAt(count)))
				{
					flag = false;
					
					System.out.println(num.charAt(count));
				}
				index++;
			}
			
			if(index == 3)
				{
					if((num.charAt(index)) != '-')
					{
						flag = false;
					}
				}
			index++;
			if(Character.isLetter(num.charAt(index)))
			{
				if(num.charAt(index) > 'N')
				{
					flag = false;
				}
			}
			else
			{
				flag = false;
			}
					
		}
		return flag;
	}
}

