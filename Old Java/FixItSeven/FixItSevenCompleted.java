package TextDemo;
import javax.swing.JOptionPane;

public class FixItSeven {

	public static void main(String[] args) {
       
		String inputLine;
		char   inputChar;
		
		inputLine = JOptionPane.showInputDialog(null,"Enter a line of text","Character Demo", JOptionPane.INFORMATION_MESSAGE);
		
		inputChar = inputLine.charAt(10);
		
		if (Character.isLetter(inputChar))
		{
			JOptionPane.showMessageDialog(null, "Position 11 is a Letter","Letter",JOptionPane.INFORMATION_MESSAGE);
		}

		
	}

}
