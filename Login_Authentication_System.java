/*
Create a login system:

Input username and password
Rules:
Username cannot be empty → throw InvalidUsernameException
Password must be at least 6 characters → throw WeakPasswordException
*/
package JAVA_DAY_11;
import java.util.Scanner;
class InvalidUsernameException extends Exception
{

	private static final long serialVersionUID = 1L;

	public InvalidUsernameException(String msg)
	{
		super(msg);
	}
}
class WeakPasswordException extends Exception
{
	private static final long serialVersionUID = 1L;

	public WeakPasswordException(String msg)
	{
		super(msg);
	}
}
public class LOGIN_AUTHENTICATION_SYSTEM {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String username = null;
		String password;
		
		try {
			System.out.println("Enter the username:");
			username = sc.nextLine();
			if(username.isEmpty())
			{
				throw new InvalidUsernameException("Inalid username!\nTry again!");
			}
			System.out.println("Username has been set!");
			
			System.out.println("Enter the password:");
			password = sc.nextLine();
			if(password.length()<6)
			{
				throw new WeakPasswordException("Weak password!\nTry again!");
			}
			System.out.println("Password has been set!");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		sc.close();
	}

}
