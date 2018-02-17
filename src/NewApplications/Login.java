package NewApplications;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.Cursor;

public class Login extends SignUp
{

	private JFrame loginPageFrame;
	private JTextField usernameTF;
	private JPasswordField passwordTF;
	
	String actualUsername;
	String actualPassword;
	String expectedUsername = "Das";
	String expectedPassword = "King";
	private JLabel createANewAccountLbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Login window = new Login();
					window.loginPageFrame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		loginPageFrame = new JFrame();
		loginPageFrame.getContentPane().setForeground(new Color(0, 255, 204));
		loginPageFrame.setBounds(200, 200, 638, 300);
		loginPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginPageFrame.getContentPane().setLayout(null);
		
		JLabel welcomeToLoginTF = new JLabel("Welcome to Login Page");
		welcomeToLoginTF.setBounds(386, 11, 184, 35);
		welcomeToLoginTF.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		loginPageFrame.getContentPane().add(welcomeToLoginTF);
		
		JLabel usernameLbl = new JLabel("Username:");
		usernameLbl.setBounds(341, 65, 83, 23);
		usernameLbl.setFont(new Font("Shruti", Font.PLAIN, 16));
		loginPageFrame.getContentPane().add(usernameLbl);
		
		JLabel passwordLbl = new JLabel("Password:");
		passwordLbl.setBounds(341, 132, 73, 23);
		passwordLbl.setFont(new Font("Shruti", Font.PLAIN, 16));
		loginPageFrame.getContentPane().add(passwordLbl);
		
		//***************************************************** User name text field **************************************************
		usernameTF = new JTextField();
		usernameTF.setToolTipText("Enter username");
		usernameTF.setBounds(434, 65, 154, 20);
		usernameTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isAlphabetic(c) || Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		loginPageFrame.getContentPane().add(usernameTF);
		usernameTF.setColumns(10);
		
		//***************************************************** Password text field **************************************************
		passwordTF = new JPasswordField();
		passwordTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkForEmptyField();
				}
			}
		});
		passwordTF.setToolTipText("Enter user password");
		passwordTF.setBounds(434, 132, 154, 20);
		loginPageFrame.getContentPane().add(passwordTF);
		
		//************************************************** Login Button ************************************************************
		JButton loginBtn = new JButton("Login");
		loginBtn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkForEmptyField();
				}
			}
		});
		loginBtn.setToolTipText("Click on this button to login into application");
		loginBtn.setBounds(323, 182, 89, 23);
		loginBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				checkForEmptyField();
			}
		});
		loginBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginPageFrame.getContentPane().add(loginBtn);
		
		//************************************************** Reset Button ************************************************************
		JButton resetBtn = new JButton("Reset");
		resetBtn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					reset();
				}
			}
		});
		resetBtn.setToolTipText("Click on this button to reset username and password");
		resetBtn.setBounds(423, 182, 89, 23);
		resetBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				reset();
			}
		});
		resetBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginPageFrame.getContentPane().add(resetBtn);
		
		//************************************************** Exit Button ************************************************************
		JButton exitBtn = new JButton("Exit");
		exitBtn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					exit();
				}
			}
		});
		exitBtn.setToolTipText("Click on this button to exit from login page");
		exitBtn.setBounds(522, 182, 89, 23);
		exitBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				exit();
			}
		});
		exitBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginPageFrame.getContentPane().add(exitBtn);
		
		//********************************************** Create new account link text **********************************************
		createANewAccountLbl = new JLabel("Create a new account");
		createANewAccountLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		createANewAccountLbl.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent evt) 
			{
				//open signup page
				SignUp.main(null);
				
				//close login page
				loginPageFrame.dispose();
			}
		});
		createANewAccountLbl.setToolTipText("Click here to create a new account");
		createANewAccountLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		createANewAccountLbl.setBounds(445, 216, 134, 23);
		loginPageFrame.getContentPane().add(createANewAccountLbl);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 313, 261);
		panel.setBackground(Color.DARK_GRAY);
		loginPageFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel imageLbl = new JLabel("image");
		imageLbl.setIcon(new ImageIcon(Login.class.getResource("/Images/11263df - Copy.jpg")));
		imageLbl.setBounds(0, -12, 313, 224);
		panel.add(imageLbl);
		
		JLabel lbltypeHere = new JLabel("...Type Here...");
		lbltypeHere.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltypeHere.setForeground(Color.WHITE);
		lbltypeHere.setBounds(87, 212, 135, 25);
		panel.add(lbltypeHere);
		
	}
	
	private void checkForEmptyField()
	{
		actualUsername = usernameTF.getText();
		actualPassword = passwordTF.getText();
		
		//show an error message if username and password text field is left blank
		if (actualUsername.isEmpty() && actualPassword.isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please Enter Username and Password", "Login Error", JOptionPane.ERROR_MESSAGE);
		}
		
		//show an error message if username text field is left blank
		else if (actualUsername.isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please Enter Username", "Login Error", JOptionPane.ERROR_MESSAGE);
		}
		
		//show an error message if password text field is left blank
		else if (actualPassword.isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please Enter Password", "Login Error", JOptionPane.ERROR_MESSAGE);
		}
		
		//open restorent page if both username and passford entered details are correct
		else
		{
			verifyCredentials();
		}	
	}
	
	private void verifyCredentials()
	{
		if(actualUsername.equals(expectedUsername))
		{
			if(actualPassword.equals(expectedPassword))
			{
				//open restorent page
				Restorent.main(null);
				
				//close login page
				loginPageFrame.dispose();

			}
			else
			{
				JOptionPane.showMessageDialog(null, "You have entered Invalid Password", "Error Message", JOptionPane.ERROR_MESSAGE);
				passwordTF.setText(null);
			}		
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You have entered Invalid Username", "Error Message", JOptionPane.ERROR_MESSAGE);
			usernameTF.setText(null);
		}
		
	
		//JOptionPane.showMessageDialog(null, "Exception error", "Error Message", JOptionPane.ERROR_MESSAGE);
		
	}
	private void reset()
	{
		usernameTF.setText(null);
		passwordTF.setText(null);
	}
	
	private void exit()
	{
		loginPageFrame = new JFrame("Exit");
		if(JOptionPane.showConfirmDialog(loginPageFrame, "Confirm if you want to Exit", "Login Systems", 
		JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
		{
			System.exit(0);
		}
	}
}
