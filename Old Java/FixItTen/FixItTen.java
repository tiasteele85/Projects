
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FixItTen extends JFrame{
	JPanel panel;
	JButton buttonOne;
	jbutton buttonExit;
	

	public GUIdemo() {
			super("FixItTen");
			final int WINDOW_WIDTH = 350,
			           WINDOW_HEIGHT = 250;
			this.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
			
			setLayout(new GridLayout(1,2));
         	buttonOne = new JButton("Full Information");
			buttonOne.addActionListener(new buttonListener());
			add(buttonOne);	
			
			buttonExit = new JButton("Exit");
			buttonExit.addActionListener(new exitListener());
			add(buttonExit);	

			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//		this.setVisible(true);
		}
		private class buttonListener implements ActionListener
		{
			
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane.showMessageDialog(null,"hey","What you typed",JOptionPane.INFORMATION_MESSAGE);

				
			}
		}
		private class exitListener implements ActionListener
		{
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		}

	public static String main(String[] args) {
          fixitten gd = new FixItTen();		 

	}

}
