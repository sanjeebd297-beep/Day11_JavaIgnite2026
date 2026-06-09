/*
Create a program that:

Takes student answers score
Calculates percentage
Rules:
Marks cannot exceed 100 → InvalidMarksException
Negative marks not allowed → NegativeMarksException
If student ID is null → NullPointerException handling
Twist:
Use nested try-catch blocks
*/
package JAVA_DAY_11;

import java.util.Scanner;
	
	class InvalidMarksException extends Exception 
	{
		private static final long serialVersionUID = 1L;

		public InvalidMarksException(String message)
	    {
	        super(message);
	    }
	}

	class NegativeMarksException extends Exception
	{
		private static final long serialVersionUID = 1L;

		public NegativeMarksException(String message)
	    {
	        super(message);
	    }
	}

	public class ONLINE_EXAM_SYSTEM {

	    @SuppressWarnings("resource")
		public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try 
	        {
	            System.out.print("Enter Student ID: ");
	            String studentId = sc.nextLine();

	            try 
	            {
	                if (studentId.isEmpty())
	                {
	                    studentId = null;
	                }

	                System.out.print("Enter Marks out of 100: ");
	                double marks = sc.nextDouble();

	                if (marks < 0) 
	                {
	                    throw new NegativeMarksException("Negative marking not allowed");
	                }

	                if (marks > 100) 
	                {
	                    throw new InvalidMarksException( "Marks can't exceed 100");
	                }

	                double percentage = marks; 

	                System.out.println("Student ID: " + studentId);
	                System.out.println("Percentage: " + percentage + "%");
	            }
	            
	            catch (NegativeMarksException e)
	            {
	                System.out.println(e.getMessage());
	            }
	            catch (InvalidMarksException e) 
	            {
	                System.out.println(e.getMessage());
	            }
	            catch (NullPointerException e)
	            {
	                System.out.println("Student ID can't be empty");
	            }

	        }
	        catch (Exception e) {
	            System.out.println("Invalid Input");
	        }

	        sc.close();
	    }
	}
