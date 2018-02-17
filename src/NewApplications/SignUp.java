package NewApplications;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;


public class SignUp 
{
	private JFrame signUpPageFrame;
	private JTextField firstNameTF;
	private JTextField lastNameTF;
	private JTextField emailTF;
	private JTextField mobileNumberTF;
	private JPasswordField passwordTF;
	private JPasswordField confirmPasswordTF;
	private JRadioButton maleRdBtn;
	private JRadioButton femaleRdBtn;
	private JComboBox dateCB;
	private JComboBox monthCB;
	private JComboBox yearCB;
	private JTextField otpTF;
	
	
	public ArrayList<String> firstNameList = new ArrayList<String>();
	public ArrayList<String> lastNameList = new ArrayList<String>();
	public ArrayList<String> emailList = new ArrayList<String>();
	public ArrayList<String> mobileNumberList = new ArrayList<String>();
	public ArrayList<String> passwordList = new ArrayList<String>();
	public ArrayList<String> confirmPasswordList = new ArrayList<String>();
	public ArrayList<String> sexList = new ArrayList<String>();
	public ArrayList<String> dateOfBirthList = new ArrayList<String>();
	
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String password;
	private String confirmPassword;
	private String sex;
	private String dateOfBirth;
	private String otpActual;
	private String otpExpected;
	
	
	//button group method is used to select only one radio button at a time
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

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
					SignUp window = new SignUp();
					window.signUpPageFrame.setVisible(true);
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
	public SignUp() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		signUpPageFrame = new JFrame();
		signUpPageFrame.getContentPane().setBackground(Color.WHITE);
		signUpPageFrame.getContentPane().setLayout(null);
		
		//*************************************************First Name label**********************************************************
		JLabel firstNameLbl = new JLabel("First Name*");
		firstNameLbl.setBounds(384, 102, 157, 20);
		firstNameLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		signUpPageFrame.getContentPane().add(firstNameLbl);
		
		//*************************************************First Name Text Field**********************************************************
		firstNameTF = new JTextField();
		firstNameTF.setBounds(551, 102, 227, 26);
		firstNameTF.setToolTipText("Enter user first name");
		firstNameTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE))
				{
					evt.consume();
				}
			}
		});
		firstNameTF.setColumns(10);
		signUpPageFrame.getContentPane().add(firstNameTF);
		
		//*************************************************Last Name label**********************************************************
		JLabel lastNameLbl = new JLabel("Last Name*");
		lastNameLbl.setBounds(384, 152, 157, 20);
		lastNameLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		signUpPageFrame.getContentPane().add(lastNameLbl);
		
		//*************************************************Last Name Text Field**********************************************************
		lastNameTF = new JTextField();
		lastNameTF.setBounds(551, 152, 227, 26);
		lastNameTF.setToolTipText("Enter user last name");
		lastNameTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE))
				{
					evt.consume();
				}
			}
		});
		signUpPageFrame.getContentPane().add(lastNameTF);
		lastNameTF.setColumns(10);
		
		//*************************************************Email label**********************************************************
		JLabel emailLbl = new JLabel("Email*");
		emailLbl.setBounds(384, 203, 157, 20);
		emailLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		signUpPageFrame.getContentPane().add(emailLbl);
		
		//*************************************************Email Text Field**********************************************************
		emailTF = new JTextField();
		emailTF.setBounds(552, 203, 226, 26);
		emailTF.setToolTipText("Enter user email id");
		emailTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				/*char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isAlphabetic(c) || Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}*/
			}
		});
		emailTF.setColumns(10);
		signUpPageFrame.getContentPane().add(emailTF);
		
		//*************************************************Mobile Number label**********************************************************
		JLabel phoneNumberLbl = new JLabel("Mobile Number*");
		phoneNumberLbl.setBounds(384, 252, 157, 20);
		phoneNumberLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		signUpPageFrame.getContentPane().add(phoneNumberLbl);
		
		//*************************************************Mobile Number Text Field**********************************************************
		mobileNumberTF = new JTextField();
		mobileNumberTF.setBounds(551, 252, 227, 26);
		mobileNumberTF.setToolTipText("Enter user mobile number");
		mobileNumberTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c = evt.getKeyChar();
				//allow only numerical keys, back space key and delete keys
				if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
				//restrict user to enter only 10 digit mobile number
				if(mobileNumberTF.getText().length()>=10) 
				{  
					evt.consume();
				}
			}			
		});
		mobileNumberTF.setColumns(10);
		signUpPageFrame.getContentPane().add(mobileNumberTF);
		
		//*************************************************Password label**********************************************************
		JLabel passwordLbl = new JLabel("Password*");
		passwordLbl.setBounds(384, 306, 157, 20);
		passwordLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		signUpPageFrame.getContentPane().add(passwordLbl);
		
		//*************************************************Password Text Field**********************************************************
		passwordTF = new JPasswordField();
		passwordTF.setBounds(552, 304, 226, 31);
		passwordTF.setToolTipText("Password tips\r\n1. Use 8-12 characters.\r\n2. Don't use your name or email address.\r\n3. Use a mix of upper case, lower case, numbers and symbols.\r\n4. Make your password hard to guess even for a family member or close friend.");
		passwordTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				//restrict user to enter maximum 12 character password
				if (passwordTF.getText().length()>=12)
				{
					evt.consume();
				}
			}
		});
		signUpPageFrame.getContentPane().add(passwordTF);
		
		//*************************************************Confirm Password label**********************************************************
		JLabel confirmPasswordLbl = new JLabel("Confirm Password*");
		confirmPasswordLbl.setBounds(384, 362, 157, 20);
		confirmPasswordLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		signUpPageFrame.getContentPane().add(confirmPasswordLbl);
		
		//*************************************************Confirm Password Text Field**********************************************************
		confirmPasswordTF = new JPasswordField();
		confirmPasswordTF.setBounds(552, 360, 226, 31);
		confirmPasswordTF.setToolTipText("Re-enter above password");
		confirmPasswordTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				//restrict user to enter maximum 12 character confirm password
				if (confirmPasswordTF.getText().length()>=12)
				{
					evt.consume();
				}
			}
		});
		signUpPageFrame.getContentPane().add(confirmPasswordTF);
		
		//*************************************************Sex label**********************************************************
		JLabel sexLbl = new JLabel("Sex*");
		sexLbl.setBounds(384, 410, 157, 20);
		sexLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		signUpPageFrame.getContentPane().add(sexLbl);
		
		//*************************************************Male Radio Button**********************************************************
		maleRdBtn = new JRadioButton("Male");
		maleRdBtn.setBounds(551, 410, 65, 23);
		maleRdBtn.setToolTipText("Select your type of sex");
		maleRdBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (maleRdBtn.isSelected())
				{
					sex = "Male";
				}
			}
		});
		buttonGroup.add(maleRdBtn);
		maleRdBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		maleRdBtn.setBackground(Color.WHITE);
		signUpPageFrame.getContentPane().add(maleRdBtn);
		
		//*************************************************Female Radio Button**********************************************************
		femaleRdBtn = new JRadioButton("Female");
		femaleRdBtn.setBounds(693, 410, 85, 23);
		femaleRdBtn.setToolTipText("Select your type of sex");
		femaleRdBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (femaleRdBtn.isSelected())
				{
					sex = "Female";
				}
			}
		});
		buttonGroup.add(femaleRdBtn);
		femaleRdBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		femaleRdBtn.setBackground(Color.WHITE);
		signUpPageFrame.getContentPane().add(femaleRdBtn);
		
		//*************************************************Date of Birth label**********************************************************
		JLabel dateOfBirthLbl = new JLabel("Date of Birth*");
		dateOfBirthLbl.setBounds(384, 450, 157, 20);
		dateOfBirthLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		signUpPageFrame.getContentPane().add(dateOfBirthLbl);
		
		//*************************************************Date Drop down**********************************************************
		dateCB = new JComboBox();
		dateCB.setBounds(551, 452, 65, 20);
		dateCB.setToolTipText("Select your date of birth");
		dateCB.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateCB.setModel(new DefaultComboBoxModel(new String[] {"Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		signUpPageFrame.getContentPane().add(dateCB);
		
		//*************************************************Month Drop down**********************************************************
		monthCB = new JComboBox();
		monthCB.setBounds(626, 452, 77, 20);
		monthCB.setToolTipText("Select your month of birth");
		monthCB.setModel(new DefaultComboBoxModel(new String[] {"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		monthCB.setFont(new Font("Tahoma", Font.BOLD, 14));
		signUpPageFrame.getContentPane().add(monthCB);
		
		//*************************************************Year Drop down**********************************************************
		yearCB = new JComboBox();
		yearCB.setBounds(713, 454, 65, 20);
		yearCB.setToolTipText("Select your year of birth");
		yearCB.setModel(new DefaultComboBoxModel(new String[] {"Year", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"}));
		yearCB.setFont(new Font("Tahoma", Font.BOLD, 14));
		signUpPageFrame.getContentPane().add(yearCB);
		
		//*************************************************Get OTP Button**********************************************************
		JButton getOtoBtn = new JButton("Get OTP");
		getOtoBtn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkEmptyTextFields();
				}
			}
		});
		getOtoBtn.setBounds(595, 495, 138, 31);
		getOtoBtn.setToolTipText("Click on this button to get OTP on your mobile number");
		getOtoBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				checkEmptyTextFields();
			}
		});
		getOtoBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		signUpPageFrame.getContentPane().add(getOtoBtn);
		
		//************************************************* OTP Text Field**********************************************************
		otpTF = new JTextField();
		otpTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					otpExpected = otpTF.getText();
					
					validateOTP();
				}
			}
		});
		otpTF.setBounds(561, 550, 227, 26);
		otpTF.setToolTipText("Enter OTP which is sent to your above mobile number");
		otpTF.setBackground(Color.WHITE);
		otpTF.setColumns(10);
		signUpPageFrame.getContentPane().add(otpTF);
		
		//*************************************************Sign up Button**********************************************************
		JButton signupBtn = new JButton("Sign Up");
		signupBtn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					otpExpected = otpTF.getText();
					
					validateOTP();
				}
			}
		});
		signupBtn.setBounds(394, 601, 175, 38);
		signupBtn.setToolTipText("Click on sign up button to complete user registration");
		signupBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				otpExpected = otpTF.getText();
				
				validateOTP();
			}
		});
		signupBtn.setForeground(Color.WHITE);
		signupBtn.setBackground(Color.RED);
		signupBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		signUpPageFrame.getContentPane().add(signupBtn);		
		
		//*************************************************Cancel Button**********************************************************
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					System.exit(0);
				}
			}
		});
		cancelBtn.setBounds(578, 601, 189, 38);
		cancelBtn.setToolTipText("Click on cancel button to exit from sign up page");
		cancelBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		cancelBtn.setForeground(Color.WHITE);
		cancelBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		cancelBtn.setBackground(Color.RED);
		signUpPageFrame.getContentPane().add(cancelBtn);
		
		signUpPageFrame.setBounds(0, 0, 1368, 689);
		signUpPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void checkEmptyTextFields()
	{
		if(firstNameTF.getText().isEmpty() || lastNameTF.getText().isEmpty() || emailTF.getText().isEmpty() || mobileNumberTF.getText().isEmpty() || 
		passwordTF.getText().isEmpty() || confirmPasswordTF.getText().isEmpty() || (!(maleRdBtn.isSelected() || femaleRdBtn.isSelected()))
		|| dateCB.getSelectedIndex()==0 || monthCB.getSelectedIndex()==0 || yearCB.getSelectedIndex()==0)
		{
			JOptionPane.showMessageDialog(null, "Please enter mandatory details", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			transferData();
		}
	}
	
	private void transferData()
	{
		//transfer all entered details into array list
		firstName = firstNameTF.getText();
		firstNameList.add(firstName);
		
		lastName = lastNameTF.getText();
		lastNameList.add(lastName);

		email = emailTF.getText();
		emailList.add(email);
		
		mobileNumber = mobileNumberTF.getText();
		mobileNumberList.add(mobileNumber);
		
		password = passwordTF.getText();
		passwordList.add(password);
		
		confirmPassword = confirmPasswordTF.getText();
		confirmPasswordList.add(confirmPassword);	
		
		sexList.add(sex);
		
		dateOfBirth = (String) dateCB.getSelectedItem();
		
		// here i'm concatenating date, / with month
		dateOfBirth = dateOfBirth+"/"+(String) monthCB.getSelectedItem();
		
		// here i'm concatenating date / month, / with year
		dateOfBirth = dateOfBirth+"/"+(String) yearCB.getSelectedItem();
		dateOfBirthList.add(dateOfBirth);
		
		validateFirstName();
	}
		
	private void validateFirstName()
	{
		//show invalid error message if the length of first name is not equal to 3
		if(!(firstName.length()>=3))
		{
			JOptionPane.showMessageDialog(null, "Invalid First Name", "Error", JOptionPane.ERROR_MESSAGE);
			firstNameTF.setText(null);
		}
		else
		{
			validateEmail();
		}
	}

	private void validateEmail()
	{
		/*show invalid error message if email pattern doesn't matches the specified patterns like Ram@gmail.com or
		Ram92@gmail.com or Ram_lakshman@gmail.com or Ram92_lakshman@gmail.com or  Ram_lakshman25@gmail.com or Ram15_lakshman25@gmail.com 
		or Ram.seetha@gmail.com or Ram25.seetha@gmail.com or Ram.seetha96@gmail.com or Ram92.seetha96@gmail.com*/
		if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z]+[.]{1}+[a-zA-Z]+$", emailTF.getText()) || 
			Pattern.matches("^[a-zA-Z0-9]+[_]{1}+[a-zA-Z0-9]+[@]{1}+[a-zA-Z]+[.]{1}+[a-zA-Z]+$", emailTF.getText()) ||
			Pattern.matches("^[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+[@]{1}+[a-zA-Z]+[.]{1}+[a-zA-Z]+$", emailTF.getText())))
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			validateMobileNumber();
		}
	}
	
	private void validateMobileNumber()
	{
		//show invalid error message if first digit not start with 9 or 8 or 7 and length of mobile number not equal to 10
		if(!((mobileNumber.charAt(0)=='9' || mobileNumber.charAt(0)=='8' || mobileNumber.charAt(0)=='7')&& mobileNumber.length()==10))
		{
			JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
			mobileNumberTF.setText(null);
		}
		else
		{
			validatePassword();
		}
	}
	
	private void validatePassword()
	{
		//show invalid error message if password length is not in between 6 to 12
		if(!((passwordTF.getText().length()>6) && (passwordTF.getText().length()<=12)))
		{
			JOptionPane.showMessageDialog(null, "Password length should be grater than 6 and less than 12", "Error", JOptionPane.ERROR_MESSAGE);
			passwordTF.setText(null);
		}
		else
		{
			validateConfirmPassword();
		}
	}
	
	private void validateConfirmPassword()
	{
		//show an error message if password and confirm password entered is not same
		if(!(password.equals(confirmPassword)))
		{	
			JOptionPane.showMessageDialog(null, "Password and confirm password is not same", "Error", JOptionPane.ERROR_MESSAGE);
			passwordTF.setText(null);
			confirmPasswordTF.setText(null);
		}
		else
		{
			generateOTP();
		}
	}
	
	private  void generateOTP()
	{
		System.out.println("Your OTP is: ");
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String splChar = "@$&";
		int length = 6;		
		
		String pwd = letters+numbers+splChar;
		Random r = new Random();
		char[] newPass = new char[length];
		
		for(int i=0; i<length; i++)
		{
			newPass[i] = pwd.charAt(r.nextInt(pwd.length()));
		}
		otpActual = String.valueOf(newPass);
		System.out.println(otpActual);	
		
		JOptionPane.showMessageDialog(null, "Please enter OTP", "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void validateOTP()
	{
		//check for empty OTP text field
		if (otpExpected.length() == 0)
		{
			JOptionPane.showMessageDialog(null, "Please enter OTP", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else if(otpExpected.equals(otpActual))
		{
			JOptionPane.showMessageDialog(null, "Congrats Signup Successfull", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
			
			//reset all text fields
			setDefault();
			
			//open login page
			Login.main(null);
			
			//close login page
			signUpPageFrame.dispose();
		}
		else
		{
			//show an error message if otp doesn't same	
			JOptionPane.showMessageDialog(null, "You have entered wrong OTP", "Error", JOptionPane.ERROR_MESSAGE);
			otpTF.setText(null);
		}
	}
	
	private void setDefault()
	{
		firstNameTF.setText(null);
		lastNameTF.setText(null);
		emailTF.setText(null);
		mobileNumberTF.setText(null);
		passwordTF.setText(null);
		confirmPasswordTF.setText(null);
		dateCB.setSelectedIndex(0);
		monthCB.setSelectedIndex(0);
		yearCB.setSelectedIndex(0);
		otpTF.setText(null);
	}
}
