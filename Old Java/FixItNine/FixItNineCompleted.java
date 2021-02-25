import java.util.InputMismatchException;
import java.util.Scanner;

public class FixItNine 
{

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
 
		int answer = 0;
		try 
     	{
    	 answer = console.nextInt();
     	}
    	catch (InputMismatchException e)
    	 {
    		 System.out.println("Bad Entry");
    	 }
    }

}

