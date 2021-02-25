
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class FixItFour {

	public static void main(String[] args) throws IOException {
		String studentName;
		int    yearNum = 0;
		
		
		for(int ctr = 0; ctr < 3; ctr--)
		{
			studentName = JOptionPane.showInputDialog(null, "Enter the name of Student "+ctr,"Student Entry",JOptionPane.INFORMATION_MESSAGE);
			yearNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the year of Student "+ctr,"Student Entry",JOptionPane.INFORMATION_MESSAGE));
		}
		
	}

}
