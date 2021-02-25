
public class RecursiveMessage 
{

	public static class resurseMe 
	{
		public static void curseMess(int n)
		{
			if (n > 0) 
			{
				System.out.println("Curse words");
				curseMess(n - 1);
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		RecursiveMessage.resurseMe.curseMess(5);
	}
	

}
