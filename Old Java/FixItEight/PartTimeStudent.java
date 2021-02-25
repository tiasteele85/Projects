
public class PartTimeStudent extends Student {
	String employer;

	public PartTimeStudent(String pemployer, String pname, double pgpa) {
		super(pname,  pgpa);
		this.employer = pemployer;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String pemployer) {
		this.employer = pemployer;
	}
	

}
