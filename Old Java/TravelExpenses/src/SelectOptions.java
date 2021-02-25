import javax.swing.*;
import java.awt.*;

public class SelectOptions extends JPanel
{	
	//create variables for calculations
	private double total;
	private double air,
				   car,
				   hotel,
				   reg;
	
	String str;
	
	//create GUI variables
	JCheckBox airFare;
	JTextField AirFare;
	JCheckBox rentalCar;
	JTextField RentalCar;
	JCheckBox lodging;
	JTextField Lodging;
	JCheckBox registration;
	JTextField Registration;
	
	
	public SelectOptions()
	{
		//set layout
		setLayout(new GridLayout(4,2));
		
		//define GUI variables
		airFare = new JCheckBox("AirFare"); //AirFare Check box
		AirFare = new JTextField(10); //accompanying text field to enter data
		rentalCar = new JCheckBox("Rental Car"); //Rental Check box
		RentalCar = new JTextField(10); 
		lodging = new JCheckBox("Lodging");
		Lodging = new JTextField(10);
		registration = new JCheckBox("Registration");
		Registration = new JTextField(10);
		
		//set calculated variables to temp values
		total = 0;
		air = 0;
		car = 0;
		hotel = 0;
		reg = 0;
		
		//add to content pane
		add(airFare);
		add(AirFare);
		add(rentalCar);
		add(RentalCar);
		add(lodging);
		add(Lodging);
		add(registration);
		add(Registration);
		
		//set textfields to enterable data
		AirFare.setEditable(true);
		RentalCar.setEditable(true);
		Lodging.setEditable(true);
		Registration.setEditable(true);
		
		
		
		
	}
	
	//calculate and return total costs to user
	public double getTotalPaid()
	{
		getMiddle();
		total = air + car + hotel + reg;
		return total;
	}
	
	//flag to check if lodging expense should be calculated
	public boolean madeLodging()
	{	
		boolean flag = false;
		if(hotel > 0)
		{
			flag = true;
		}
		return flag;
	}
	
	//return hotel costs paid
	public double getLodging()
	{
		return hotel;
	}
	
	//calculation selections made from checkboxes
	public void getMiddle()
	{
		
		if(airFare.isSelected())
		{
			//tally airFare if checkbox is selected
			str = AirFare.getText();
			air = Double.parseDouble(str);
		}
		if(rentalCar.isSelected())
		{
			//tally car rental if checkbox is selected
			str = RentalCar.getText();
			car = Double.parseDouble(str);
		}
		if(lodging.isSelected())
		{
			//tally hotel/accommodations if checkbox is selected
			str = Lodging.getText();
			hotel = Double.parseDouble(str);
			
		}
		if(registration.isSelected())
		{
			//tally registration/conference fees if checkbox is selected
			str = Registration.getText();
			reg = Double.parseDouble(str);
		}	
	}
	
}
