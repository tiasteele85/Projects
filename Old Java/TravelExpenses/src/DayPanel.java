import javax.swing.*;
import java.awt.*;

public class DayPanel extends JPanel
{	
	//create GUI variables
	private double daysThere;
	private String str;
	private JLabel message;
	private JTextField daysTextField;
	
	public DayPanel()
	{	
		//define GUI variables
		message = new JLabel("Number of days on trip:");
		daysTextField = new JTextField(10);
		
		//set layout
		setLayout(new FlowLayout());
		
		//add to content pane
		add(message);
		add(daysTextField);
		
		
		
	}
	
	//return days for computation
	public double getDays()
	{		
		str = daysTextField.getText();
		daysThere = Double.parseDouble(str);
		return daysThere;
	}
}
