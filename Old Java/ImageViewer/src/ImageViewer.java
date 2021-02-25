/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program to Demonstrate file opening and displaying image
* Input:  prompts user for file location
* Desired Output:  Total cost of service;
* Variables and Classes:  JPanel display; JLabel greet, taunt; JButton open; JFileChooser file;
						  int opened; ImageIcon image; File gotIT; String filename			
* Formulas:  
* Description of the main algorithm: Program to Demonstrate file opening and displaying image
* April 24, 2015
**/

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class ImageViewer extends JFrame
{
	private JPanel display;
	private JLabel greet;
	private JLabel taunt;
	private JButton open;
	
	
	
	public ImageViewer()
	{
		super("Picture Opener");
		
		
		
		//create greeting message
		greet = new JLabel("Select a picture file");
		
		//set layout
		setLayout(new BorderLayout());
		
		setPanel();
		
		//set close 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add panel
		add(greet, BorderLayout.NORTH);
		add(display, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
		
	}
	
	public void setPanel()
	{
		display = new JPanel();
		taunt = new JLabel("Do you want to see your pic?");
		open = new JButton("Open Picture");		
		
		//set panel Layout	
		display.setLayout(new GridLayout(2,1));		
		
		//set button action event
		open.addActionListener(new ButtonListener());
		
		//add to panel
		display.add(taunt);
		display.add(open);
	}
	
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JFileChooser file = new JFileChooser();
			int opened = file.showOpenDialog(null);
			
			//allow user to open file and parse image
			if(opened == JFileChooser.APPROVE_OPTION)
			{
				File gotIT = file.getSelectedFile();
				String filename = gotIT.getPath();
				JOptionPane.showMessageDialog(null, filename);
				ImageIcon image = new ImageIcon("filename");
				taunt.setIcon(image);
				taunt.setText(null);
				pack();
			}
		
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
		
		
		new ImageViewer();
		
	}

}
