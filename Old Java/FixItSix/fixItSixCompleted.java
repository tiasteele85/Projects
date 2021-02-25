import javax.swing.*;
public class fixItSix {

	public static void main(String[] args) {
		int[] testArray = new int[3];
		
		for (int i = 0; i < testArray.length; i++)
		{
			testArray[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter an Integer","ints",JOptionPane.QUESTION_MESSAGE));
		}
        System.out.println("the smallest int is in cell "+smallestInt(testArray));
	}
	public static int smallestInt(int[] checkArray)
	{
		int smallestIndex = 0;
		int smallestValue = 999999999;
		for (int i = 0; i < checkArray.length; i++)
		{
		  if (checkArray[i] < smallestValue )
		  {
			  smallestValue = checkArray[i];
			  smallestIndex = i;
		  }
		}
		return smallestIndex;
		
	}

}
