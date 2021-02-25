/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program for employees to create expense report;
* Input:  start and stop buttons
* Desired Output:  Time calculations
* Variables and Classes:  	TitlePanel title; DayPanel leftPanel; SelectOptions center;
							VehicleOptions rightPanel; JPanel buttonPanel; AllowableExpenses paidExp;
							JButton calc; double expAllowed, totalAllowable, totalPaid; 
							Classes AllowableExpenses, DayPanel, SelectOptions, TitlePanel, VehicleOptions.
* Formulas:  
* Description of the main algorithm: Program to Demonstrate an expense report, with company defined rules.
* 									 Allows the user to enter in values and tabulates what the company will 
* 									 pay back.
* April 24, 2015
**/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TravelExpenses extends JFrame 
{	
	//GUI Variable creation
	private TitlePanel title; 
	private DayPanel leftPanel;
	private SelectOptions center;
	private VehicleOptions rightPanel;
	private JPanel buttonPanel;
	private AllowableExpenses paidExp;
	private JButton calc;
	
	
	TravelExpenses()
	{	
		title = new TitlePanel(); //import title panel
		leftPanel = new DayPanel(); //import number of left panel
		center = new SelectOptions(); //import panel of options
		rightPanel = new VehicleOptions(); //import panel of vehicle choices
		buttonPanel = new JPanel(); //create final panel for button
		
		
		//set layout
		setLayout(new BorderLayout());
		
		//add panels
		add(title, BorderLayout.NORTH);
		add(leftPanel, BorderLayout.WEST);
		add(center, BorderLayout.CENTER);
		add(rightPanel, BorderLayout.EAST);
		
		//Build Last panel and add it
		getPanel(); 		
		add(buttonPanel, BorderLayout.SOUTH);
		
		//Call action selections
		rightPanel.setSelections();
		
		//set close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//pack and display 
		pack();
		setVisible(true);
		
	}
	
	private void getPanel()
	{
		//Define and create button pane
		calc = new JButton("Calculate Report");
		calc.addActionListener(new CalcButtonListener());
		buttonPanel.add(calc);
	}
	
	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
			double expAllowed = 0;
			double totalAllowable = 0;
			double totalPaid = 0;
			paidExp = new AllowableExpenses(leftPanel.getDays());
			
			rightPanel.setSelections();
			
			
			center.getMiddle();
			
			//House cleaning for variables that are paid based on whether incurred
			if (center.madeLodging())//flag to determine if lodging was paid
			{
				expAllowed+= paidExp.getLodging(center.getLodging());
			}
				
			if(rightPanel.madeMiles())//flag to determine if gas was paid
			{		
				//if gas was paid call Allowable Expenses to calculate amount paid
				//add to total for calculated paid expenses
				expAllowed += paidExp.gasPaid(rightPanel.getMiles());
			}
			
			if(rightPanel.madeParking())//flag to determine if parking was paid
			{
				//if parking was paid call Allowable Expenses to calculate amount paid
				//add to total for calculated paid expenses
				expAllowed += paidExp.parkingPaid(rightPanel.getParking());
			}
			if(rightPanel.madeTaxi())
			{
				//if taxi was paid call Allowable Expenses to calculate amount paid
				//add to total for calculated paid expenses
				expAllowed += paidExp.taxiPaid(rightPanel.getTaxi());
			}
			
			//call rest of allowable expenses
			expAllowed += paidExp.getMeals();
			
			//call total that the company would have paid
			totalAllowable = paidExp.totalAllowable(rightPanel.getMiles());
			
			totalPaid = (center.getTotalPaid() + rightPanel.getParking() + 
						rightPanel.getTaxi());
			
			JOptionPane.showMessageDialog(null, "Total Cost: " + totalPaid +
											"\nAllowable Expenses: " + totalAllowable +
											"\nTotal Qualified/Paid: " + expAllowed + 
											"\nincludes meal waiver per day." +
											"\nTotal Paid by Employee: " + (totalPaid - expAllowed));
		}
	}
	
	public static void main(String[] args)
	{
		new TravelExpenses();
		
	}
}
