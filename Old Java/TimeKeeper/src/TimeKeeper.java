/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program java applet to function as stop watch
* Input:  start and stop buttons
* Desired Output:  Time calculations
* Variables and Classes:  	JPanel clock, buttonMaker; JLabel greeting, tally; JButton start, stop, reset; 
* 							final int TIME_DELAY; int s, m, h; Timer timer; 
* 							DecimalFormat space; String str;	
* Formulas:  
* Description of the main algorithm: Program to Demonstrate a Stopwatch
* April 24, 2015
**/


import javax.swing.*;

import java.awt.*;
import java.text.DecimalFormat;
import java.awt.event.*;


public class TimeKeeper extends JApplet
{
	//design elements
	private JPanel clock;
	private JPanel buttonMaker; 
	private JLabel greeting;
	private JLabel tally;
	private JButton start;
	private JButton stop;
	private JButton reset;
	
	private final int TIME_DELAY = 1000; //time in milliseconds
	
	//timer variable
	Timer timer;
	
	//counting variable for time
	private int s = 00,
				m = 00,
				h = 00;
	//formating
	DecimalFormat space = new DecimalFormat("00");
	String str;
	
	
		
	public void init()
	{
		greeting = new JLabel("Stopwatch");
		
		setLayout(new BorderLayout());
		
		//build panels
		buildPanel();
		buildButtons();
		
		//add panels to layout
		add(greeting, BorderLayout.NORTH);
		add(clock, BorderLayout.CENTER);
		add(buttonMaker, BorderLayout.SOUTH);
		
		
		
	}
	
	public void buildPanel()
	{
		clock = new JPanel();
		
		//set initial values for label
		str = (space.format(h) + ":" + space.format(m) + ":" + space.format(s));
		tally = new JLabel(str);
		
		//set background color
		clock.setBackground(Color.RED);
		timer = new Timer(TIME_DELAY, new TimerListener());
		
		//add to panel
		clock.add(tally);
	}
	
	public void buildButtons()
	{
		buttonMaker = new JPanel();
		
		//declare buttons
		start = new JButton("Start");
		stop = new JButton("Stop");
		reset = new JButton("Reset");
		
		//add event listeners
		start.addActionListener(new ButtonListener());
		stop.addActionListener(new ButtonListener());
		reset.addActionListener(new ButtonListener());
		
		//add to panel
		buttonMaker.add(start);
		buttonMaker.add(stop);
		buttonMaker.add(reset);
	}
	
	
	
	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//calculate and display time
			
				if(s < 60)
				{
					s++;
				}
				else if (m < 60)
				{
					m++;
					s = 00;
				}
				else
				{
					h++;
					m = 00;
				}
				str = (space.format(h) + ":" + space.format(m) + ":" + space.format(s));			
				tally.setText(str);
				
				
			
		}
	}
	
	
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//set events for each button
			if(e.getSource() == start)
			{				
				timer.start();
			}
			else if(e.getSource() == stop)		
			{				
				timer.stop();
			}
			else if(e.getSource() == reset)
			{
				h = 00;
				m = 00;
				s = 00;
				tally.setText("00:00:00");
			}
		
		}
	}
	
}
