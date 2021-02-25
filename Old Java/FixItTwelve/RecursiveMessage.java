
public class RecursiveMessage {

	public static class resUrseMe {
	  public static void curseMess(int n)
	  {
		if (n > 0) {
		System.out.println("Curse words");
		curseMess(n + 1)
		}
	  }
	}
	public static void main(String[] args) {
		resurseMe.curseMess(5);
	}
	

}
