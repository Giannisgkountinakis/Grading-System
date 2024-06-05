import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class GradingSystemGui extends JFrame{

	//Panel
	private JPanel panel = new JPanel();
	
	//JTextField
	private JTextField welcomeMessageField = new JTextField("Welcome to the university grading system.");
	
	//Buttons
	private JButton loginButton = new JButton("Login");
	private JButton registerButton = new JButton("Register");
	
	
	public GradingSystemGui()
	{
		
		//Add background color
		panel.setBackground(Color.black);
		
		//Add TextField
		panel.add(welcomeMessageField);
		welcomeMessageField.setEditable(false);
		
		//Add Buttons
		panel.add(loginButton);
		panel.add(registerButton);
		
		/*Add Buttons functions --> register button first and login
		button second*/
		ButtonListener listener = new ButtonListener();
		registerButton.setFocusable(false);
		registerButton.addActionListener(listener);
		
		ButtonListener loginlistener = new ButtonListener();
		loginButton.setFocusable(false);
		loginButton.addActionListener(listener);
		
		
		this.setContentPane(panel);
		
		this.setVisible(true);
		this.setSize(300,250);
		this.setTitle("Login Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	//Functions for register button
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == registerButton)
			{
				dispose();
				new RegisterGui();
			}
			else if (e.getSource() == loginButton)
			{
				dispose();
				new LoginGui("Giannis","Gkountinakis","000","ics23127");
			}
		}
		
	}

}
