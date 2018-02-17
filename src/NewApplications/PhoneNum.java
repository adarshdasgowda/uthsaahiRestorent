package NewApplications;

import javax.swing.JOptionPane;

public class PhoneNum 
{ 
	String phoneNumber="922222556";
	public static void main(String[] args)
	{
		
		/*if(validatePhoneNumber(phoneNumber))
		{
			JOptionPane.showMessageDialog(null, "Valid");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Invalid");
		}*/
		PhoneNum obj = new PhoneNum();
		obj.validatePhoneNumber();
		
	}
	
	public static boolean validatePhoneNumber(String in)
	{
		return in.charAt(0) == '9' && in.length() == 10;	
	}
	
	public  void validatePhoneNumber()
	{
		if(!(phoneNumber.charAt(0)=='9' && phoneNumber.length()==10))
		{
			JOptionPane.showMessageDialog(null, "Invalid");

		}
		
	}

}
