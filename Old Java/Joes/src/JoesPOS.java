/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program to Demonstrate GUI Point of Sale Application
* Input:  checkboxes and text fields 
* Desired Output:  Total cost of service;
* Variables and Classes:  final double OIL_CHANGE, LUBE_JOB, RADIATOR_FLUSH, TRANSMISSION_FLUSH,
* 						  INSPECTION, MUFFLER_REPLACE, TIRE_ROTATION, LABOR; DecimalFormat dollar;
* 						  double total; JPanel panel, panel2, buttonPanel, spacePanel; JCheckBox lube;
						  rFlush, tFlush, inspection, mufReplace, rotateTires, other; double custom;
						  String str; JLabel note, greet, enterHours, enterParts; JTextField parts, hours;
						  JButton calcTotal;
* Formulas:  
* Description of the main algorithm: Create constant values for services, allow user to check
* 									 performed services and calculate a total, if service is not in 
* 									 list allow option to enter custom values.
* April 24, 2015
**/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class JoesPOS extends JFrame
{
	//variables constants for regular services
	private final double OIL_CHANGE = 26.00,
						 LUBE_JOB = 18.00,
						 RADIATOR_FLUSH = 30.00,
						 TRANSMISSION_FLUSH = 80.00,
						 INSPECTION = 15.00,
						 MUFFLER_REPLACE = 100.00,
						 TIRE_ROTATION = 20.00,
						 LABOR = 20.00;
	
	//Formating variable
	DecimalFormat dollar = new DecimalFormat("0.00");
	
	//accumulator variable
	private double total = 0;
	
	//GUI Variables to create application
	private JPanel panel;
	private JPanel panel2;
	private JPanel buttonPanel;
	private JPanel panelSpace;
	private JLabel greet;
	private JCheckBox oil;
	private JCheckBox lube;
	private JCheckBox rFlush;
	private JCheckBox tFlush;
	private JCheckBox inspection;
	private JCheckBox mufReplace;
	private JCheckBox rotateTires;
	private JCheckBox other;
	private JLabel note;
	private JTextField hours;
	private JTextField parts;
	private JLabel enterHours;
	private JLabel enterParts;
	private JButton calcTotal;
	
	
	public JoesPOS()
	{
		
		super("Joe's POS");
		
		
		panelSpace = new JPanel(); //space between panels dummy panel
		greet = new JLabel("Select all services:"); //user direction
		
		//checkboxes for services
		oil = new JCheckBox("Oil Change"); 
		lube = new JCheckBox("Lube Job");
		rFlush = new JCheckBox("Radiator Flush");
		tFlush = new JCheckBox("Transmission Flush");
		inspection = new JCheckBox("Inspection");
		mufReplace = new JCheckBox("Muffler Replacement");
		rotateTires = new JCheckBox("Tire Rotation");
		other = new JCheckBox("Other Service");
		note = new JLabel("Enter Values Below:"); //space holder, user direction
		
		//Enter-able fields for custom services
		hours = new JTextField(10);
		parts = new JTextField(10);
		
		//user direction
		enterHours = new JLabel("Enter the number of labor hours:");
		enterParts = new JLabel("Enter the cost of all parts:");
		
		
		//set layout
		setLayout(new BorderLayout());
		
		
		
		
		
		//create panels
		makePanel();
		makePanel2();
		makePanelButton();
		
		//add to panels to layout
		add(greet, BorderLayout.NORTH);
		add(panel, BorderLayout.WEST);
		add(panelSpace, BorderLayout.CENTER);
		add(panel2, BorderLayout.EAST);
		add(buttonPanel,BorderLayout.SOUTH);
		
		//set close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		pack();
		setVisible(true);
	}
	
	public void makePanel()
	{
		panel = new JPanel();
		
		//create layout in panel, formatting
		panel.setLayout(new GridLayout(7,1));
		
		
		//add checkboxes to panel
		panel.add(oil);
		panel.add(lube);
		panel.add(rFlush);
		panel.add(tFlush);
		panel.add(inspection);
		panel.add(mufReplace);
		panel.add(rotateTires);
		
	}
	
	public void makePanel2()
	{
		panel2 = new JPanel();
		
		//set panel layout
		panel2.setLayout(new GridLayout(3,2));
		
		//create custom order menu listing
		panel2.add(other);
		panel2.add(note);
		panel2.add(enterHours);
		panel2.add(hours);
		panel2.add(enterParts);
		panel2.add(parts);
		
		
	}
	
	public void makePanelButton()
	{	
		buttonPanel = new JPanel();
		
		//create button and add event handling
		calcTotal = new JButton("Calculate Total");
		calcTotal.addActionListener(new CalcButtonListener());
		buttonPanel.add(calcTotal);
		
	}
	
	//Calculate totals based on checked services
	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double custom; //temp variable
			String str; //temp variable
			
			//test user selection and accumulate total
			if(oil.isSelected())
			{
				total += OIL_CHANGE;
			}
			if(lube.isSelected())
			{
				total += LUBE_JOB;
			}
			if(rFlush.isSelected())
			{
				total += RADIATOR_FLUSH;
			}
			if(tFlush.isSelected())
			{
				total += TRANSMISSION_FLUSH;
			}
			if(inspection.isSelected())
			{
				total += INSPECTION;
			}
			if(mufReplace.isSelected())
			{
				total += MUFFLER_REPLACE;
			}
			if(rotateTires.isSelected())
			{
				total += TIRE_ROTATION;
			}
			if(other.isSelected())
			{
				total+= Double.parseDouble(parts.getText());
				str = hours.getText();
				custom = Double.parseDouble(str);
				total += (custom * LABOR);
			}
			
			JOptionPane.showMessageDialog(null, "Total: $" + dollar.format(total));
			
		}
	}
		
	
	public static void main(String[] args)
	{
		new JoesPOS();
	}
}
