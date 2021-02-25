import javax.swing.*;
import java.awt.*;


public class VehicleOptions extends JPanel
{	
	//variables to hold computations
	private double miles = 0;
	private double parking = 0;
	private double taxiFee = 0;
	private int did,
				did2;
	
	//create radio buttons and grouping
	private JRadioButton none;
	private JRadioButton car; 
	private JRadioButton taxi;
	private ButtonGroup group;
	
	public VehicleOptions()
	{	
		//define radio buttons and group
		none = new JRadioButton("None" , true);
		car= new JRadioButton("Car");
		taxi = new JRadioButton("Taxi");		
		group = new ButtonGroup();
		
		
		//set layout and border
		setLayout(new GridLayout(3, 1));
		setBorder(BorderFactory.createTitledBorder("Select Transportation Mode:"));
		
		//create button group to isolate choices
		group.add(none);
		group.add(car);
		group.add(taxi);
		
		//add buttons to layout
		add(none);
		add(car);
		add(taxi);				
		
	}
	
	//flag for calculating whether to call expense for milage
	public boolean madeMiles()
	{
		boolean flag = false;
		
		if(miles > 0)
		{
			flag = true;
		}
		
		return flag;		
	}
	
	//return miles computed
	public double getMiles()
	{
		return miles;
	}
	
	//flag for calculating whether to call expense for parking
	public boolean madeParking()
	{
		boolean flag = false;
		
		if(parking > 0)
		{
			flag = true;
		}
		return flag;
	}
	
	//returns user defined parking entered
	public double getParking()
	{
		return parking;
	}
	
	//flag for calculating whether to call expense for taxi
	public boolean madeTaxi()
	{
		boolean flag = false;
		
		if(taxiFee > 0)
		{
			flag = true;
		}
		
		return flag;
	}
	
	//returns cost paid of taxi
	public double getTaxi()
	{
		return taxiFee;
	}
	
	//determine user selections
	public void setSelections()
	{
		//determine selections
		if (car.isSelected())
		{
			did = JOptionPane.showConfirmDialog(null, "Did you tally Miles?", 
												"Confirmation", JOptionPane.YES_NO_OPTION);
			if(did == JOptionPane.YES_OPTION)
			{
				miles = Double.parseDouble(JOptionPane.showInputDialog("Enter miles." ));
			}
					
			did2 = JOptionPane.showConfirmDialog(null, "Did you pay for parking?", 
												"Confirmation", JOptionPane.YES_NO_OPTION);
			if(did2 == JOptionPane.YES_OPTION)
			{
				parking = Double.parseDouble(JOptionPane.showInputDialog("Enter total" + 
																		"parking."));
			}
		}
				
		if(taxi.isSelected())
		{
			taxiFee = Double.parseDouble(JOptionPane.showInputDialog(null,
													"Enter total taxi cost."));
		}
	}
}
