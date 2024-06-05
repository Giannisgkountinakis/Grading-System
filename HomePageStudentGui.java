import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HomePageStudentGui extends JFrame{

	//JPANEL
	private JPanel panel = new JPanel();
	
	//JBUTTONS
	private JButton gradesButton = new JButton("Grades");
	private JButton logOutButton = new JButton("Log out");
	
	//JLABELS
	private JLabel messageForUserField = new JLabel("Choose one of the below actions");
	
	
	public HomePageStudentGui()
	{
		//Add background color
		panel.setBackground(Color.black);
		
		//Add label color
		messageForUserField.setForeground(Color.white);
		
		//Add message
		panel.add(messageForUserField);
		
		//Add buttons
		panel.add(gradesButton);
		panel.add(logOutButton);
		
		logOutButton.setBackground(Color.red);
		
		ButtonListener logOutListener = new ButtonListener();
		logOutButton.addActionListener(logOutListener);
		
		this.setContentPane(panel);
		
		this.setVisible(true);
		this.setSize(270,250);
		this.setTitle("Home Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == logOutButton)
			{
				dispose();
				new GradingSystemGui();
			}
		}
	}
}
