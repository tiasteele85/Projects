
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FixItTen extends JFrame{
	
	

	public FixItTen() {
			super("FixItTen");
			final int WINDOW_WIDTH = 350,
			           WINDOW_HEIGHT = 250;
			JPanel panel; //no need everything is add to the content pane
			JButton buttonOne;
			JButton buttonExit;
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

	public static void main(String[] args) {
          new FixItTen();		 

	}

}
