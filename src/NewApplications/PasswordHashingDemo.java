package NewApplications;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class PasswordHashingDemo 
{

	Map<String, String> DB = new HashMap<String, String>();
	public static final String SALT = "my-salt-text";

	public static void main(String args[]) 
	{
		PasswordHashingDemo demo = new PasswordHashingDemo();
		demo.signup("john", "dummy123");

		// login should succeed.
		if (demo.login("john", "dummy123"))
			System.out.println("user login successfull.");

		// login should fail because of wrong password.
		if (demo.login("john", "blahblah"))
			System.out.println("User login successfull.");
		else
			System.out.println("user login failed.");
	}

	public void signup(String username, String password) 
	{
		String saltedPassword = SALT + password;
		String hashedPassword = generateHash(saltedPassword);
		DB.put(username, hashedPassword);
	}

	public Boolean login(String username, String password) 
	{
		Boolean isAuthenticated = false;

		// remember to use the same SALT value you used while storing password
		// for the first time.
		String saltedPassword = SALT + password;
		String hashedPassword = generateHash(saltedPassword);

		String storedPasswordHash = DB.get(username);
		if(hashedPassword.equals(storedPasswordHash))
		{
			isAuthenticated = true;
		}
		else
		{
			isAuthenticated = false;
		}
		return isAuthenticated;
	}

	public static String generateHash(String input) 
	{
		StringBuilder hash = new StringBuilder();

		try 
		{
			MessageDigest sha = MessageDigest.getInstance("SHA-1");
			byte[] hashedBytes = sha.digest(input.getBytes());
			char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
			for (int idx = 0; idx < hashedBytes.length; ++idx) 
			{
				byte b = hashedBytes[idx];
				hash.append(digits[(b & 0xf0) >> 4]);
				hash.append(digits[b & 0x0f]);
			}
		} 
		catch (NoSuchAlgorithmException e) 
		{
			// handle error here.
		}
		return hash.toString();
	}
}

/*
 How password hashing works?
In hashing, you take a input string (in our case, a password), add a salt to the string, generate the hash value (using SHA-1 algorithm for 
example), and store the hash value in DB. For matching passwords while login, you do the same hashing process again and match the hash value 
instead of matching plain passwords and authenticate users.

Hashing is different from encryption. Because, encryption is two way, means that you can always decrypt the encrypted text to get the original 
text. But Hashing is one way, you can never get the original text from the hash value. Thus it gives more security than encryption.

To generate hash, you can make use of any hashing algorithms out there – MD5, SHA-1, etc. Before generating a hash, adding a salt to the 
password will give added security. Salt is nothing but a simple text that is known only to you/your application. It can be “zebra” or 
“I’mGod” or anything you wish.

Below, I’m giving a Java example of how to do password hashing in an login module.
*/
