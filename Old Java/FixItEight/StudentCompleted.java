
public class Student 
{
  private String name;
  private double gpa;

  public Student() {

		this.name = " ";
		this.gpa = 0.0;
	}
public Student(String pname, double pgpa) 
{

	this.name = pname;
	this.gpa = pgpa;
}

public void setName(String pname) 
{
	this.name = pname;
}

public void setGpa(double pgpa) {
	this.gpa = pgpa;
}
public String getName() {
	return name;
}

public double getGpa() {
	return gpa;
}

  
}
