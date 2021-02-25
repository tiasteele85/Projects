import java.util.Scanner;
public class FixItThree {
    static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		int answer = 0;
		
		System.out.println("Enter a number from one to ten");
		answer = console.nextInt();
		
		boolean truth = true;
		if answer > 10 && answer < 0 
			{
			System.out.println("Your entry is wrong");
		    System.out.println("You can't follow simple instructions");
		    }
		else
		{
	     System.out.println("You're good with "+answer);
  		 System.out.println("At least you can follow instructions");
  		 

			
	}

}
