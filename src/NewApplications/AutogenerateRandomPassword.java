package NewApplications;

import java.util.Random;
import java.util.Scanner;

public class AutogenerateRandomPassword 
{
	static char[] generatePassword(int length)
	{
		System.out.println("Your New Password is: ");
		String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String splChar = "!@#$%^&*";
		
		String pwd = letters+numbers+splChar;
		Random r = new Random();
		char[] newPass = new char[length];
		
		for(int i=0; i<length; i++)
		{
			newPass[i] = pwd.charAt(r.nextInt(pwd.length()));
		}
		return newPass;
	}
	public static void main(String[] args) 
	{
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to reset your password Y or N");
		String pass = sc.next();
		sc.close();
		
		if("y".equalsIgnoreCase(pass))
		{
			System.out.println(generatePassword(8));
		}*/
		generateOTP();
	}
	
	static void generateOTP()
	{
		System.out.println("Your New Password is: ");
		String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String splChar = "@$&";
		int length = 6;
		
		String pwdd = letters+numbers+splChar;
		Random r = new Random();
		char[] newPass = new char[length];
		
		for(int i=0; i<length; i++)
		{
			newPass[i] = pwdd.charAt(r.nextInt(pwdd.length()));
		}
		System.out.println(newPass);
	}

}
