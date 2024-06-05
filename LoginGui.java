import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LoginGui extends JFrame{
	
	//JPanel
	private JPanel panel= new JPanel();
	
	//JLabel
	private JLabel messageForUserField = new JLabel("Login to your academic account");

	//JTextFields
	private JTextField idField = new JTextField("Enter your id");
	private JTextField passwordField = new JTextField("Enter your password");
	
	//JButton
	private JButton enterButton = new JButton("Enter");
	
	
	//Integers
	private int indexn=0;
	private int indexp=0;
	
	//ArrayLists strings
	private ArrayList<String> ns = new ArrayList<>();
	private ArrayList<String> lastNs = new ArrayList<>();
	private ArrayList<String> usersId = new ArrayList<>();
	private ArrayList<String> passwds = new ArrayList<>();
	
	
	
	public LoginGui(String n,String ln,String p,String i)
	{
		
		ns.add(n);
		lastNs.add(ln);
		usersId.add(i);
		passwds.add(p);
		

		//Add background color
		panel.setBackground(Color.black);
		
		//Add label color
		messageForUserField.setForeground(Color.white);
		
		//Add message
		panel.add(messageForUserField);
				
		//Add Text fields
		panel.add(idField);
		panel.add(passwordField);
				
		//Add button
		panel.add(enterButton);
		enterButton.setFocusable(false);
		

		//Adding bold font in messageForUserField
		Font boldFont = messageForUserField.getFont().deriveFont(Font.BOLD);
		messageForUserField.setFont(boldFont);
				
		ButtonListener loginListener = new ButtonListener();
		enterButton.addActionListener(loginListener);
		

		
		
		this.setContentPane(panel);
		
		this.setVisible(true);
		this.setSize(270,250);
		this.setTitle("Login Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public void details(ArrayList<String> names,ArrayList<String> lastNames,ArrayList<String> passwords,ArrayList<String> ids) {
		
		ns = names;
		lastNs = lastNames;
		passwds = passwords;
		usersId = ids;
		
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String userId = idField.getText();
			indexn = 0;
			for (String id: usersId)
			{
				if (userId.equals(id.toString()))
				{
					indexn++;
					String userPwd = passwordField.getText();
					indexp = 0;
					for (String p: passwds)
					{
						if (userPwd.equals(p.toString()))
						{
							indexp++;
						}
					}
				}
			}
			if (indexp == indexn)
			{
				JOptionPane.showMessageDialog(panel, "Welcome," + userId + " !");
				dispose();
				if (userId.equals("secretary"))
					new HomePageSecretaryGui();
				else
					new HomePageStudentGui();
			}
			else
			{
				JOptionPane.showMessageDialog(panel, "Invalid details,please try again");
			}
			
			
		}
		
	}
}
