import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FixItFive {
	private String personName;
	private String address;
	private int    age;
	private String phoneNbr;
	
	public FixItFive()
	{
		personName = "XXXXX";
		address    = "YYYYY";
		age        = 99;
		phoneNbr   = "555-111-2222";
	}
	public FixIt5 (String pName, String paddress,int pAge, String pPhone)
	{
		personName = pName;
		address    = paddress;
		age        = pAge;
		phoneNbr   = pPhone;
	}
	
	public void getPersonName()
	{
		return personName;
	}
	public String setPersonName(String pName)
	{
		personName = pName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(double pAge)
	{
		age = pAge;
	}
	public void  writePerson(FileWriter f1 ,PrintWriter p1) throws IOException
	{
		p1.println(personName+","+address+","+age+","+phoneNbr);
	}
	
	}


