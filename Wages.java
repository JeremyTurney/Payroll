/*Jeremy Turney
 *023299492
 *CSC262
 *File Name: WagesTest.java
 *Test application for class Wages
 *
 *Calculates wages from 3 employees depending on which employee's pay is hourly or salaried.
 *June 5, 2015
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Wages 
{//start class Wages

		public wages()
		{//start wages
		
			Scanner input = new Scanner ( System.in );//Allows you to take input from keyboard
		
			for (int i = 0; i < 3; i++)//for loop allows us to only all three employee entries
			{//start for loop
		
				System.out.print( "Enter employee name: " );//prints Enter employee name:
				String name = "";//creates a blank string
				name = input.next();//keyboard input set into name
		
				System.out.print( "Is this employee (1) salaried or (2) paid by the hour (1 or 2 only): ");//asks keyboard if employee is salaried or hourly
				int answer = 0;//creates int answer and sets it to 0
				answer = input.nextInt();//keyboard input set into answer
				
				
				while ( answer != 1 && answer != 2)//while loop is to make sure a 1 or 2 is entered from the keyboard. If a 1 or 2 is not entered it will keep looping until a correct entry is entered
				{//start while loop
					
					System.out.print( "Is this employee (1) salaried or (2) paid by the hour (1 or 2 only): ");//asks keyboard if employee is salaried or hourly
					int answer1 = 0;//creates int answer and sets it to 0
					answer1 = input.nextInt();//keyboard input set into answer
					answer = answer1;
				
				}//end while loop
				
				if ( answer == 1 )//if employee is salaried 
				{//start of if statement	
					
					System.out.print("Enter the annual salary amount: ");//Asks keyboard the employee's annual salary amount
					double salary = 0;//salary is set to 0
					salary = input.nextInt();//keyboard input set into salary
			
					double weeklyPay = salary / 52;//creates a double weekly pay and makes it equal to salary/52
					
					weeklyPay = Double.parseDouble(new DecimalFormat(".##").format(weeklyPay));// Allows formatting of double weeklyPay to round to 2 decimal numbers.
					
					System.out.print( " Pay for Employee " + name + " is " + weeklyPay );//outputs Pay for Employee (Employee's name) is (weeklyPay)
				
				}//end of if statement
		
				if ( answer == 2 )//if employee is paid hourly
				{//start of if statement
			
					System.out.print( " Wages for Employee " + name + " is " + calculateWages() );//outputs Wages for Employee (Employee's name) is (method calculateWages)
				
				}//end of if statement
				
				System.out.println("");//creates a blank line in between employees
			
			}//end of for loop
		
		}//end wages

	
	static double calculateWages()//Method double calculateWages()
		{//start calculateWages()
		
		Scanner input = new Scanner ( System.in );//Allows you to take input from keyboard
		
			System.out.print( " Enter Integer hourly rate: " );//outputs Enter Integer hourly rate:
			int hourlyRate = 0;//creates an int called hourlyRate and sets it to 0
			hourlyRate = input.nextInt();//keyboard input is set equal to int hourlyRate
			
			System.out.print( " Enter Integer hours worked: " );//outputs Enter Integer hours worked:
			int hoursWorked = 0;//creates int hoursWorked and sets it to 0
			hoursWorked = input.nextInt();//keyboard input is set equal to int hoursWorked
			
			int normalHours = 40; //int normalHours is set to 40
			int normalRate = 40 * hourlyRate;//int normalRate is set eual to hourlyRate * 40
			
			double overtime = (normalRate) + ( ( hoursWorked - normalHours ) *( 1.5 * hourlyRate ) );//sets double overtime to calculate overtime
			
			if ( hoursWorked > 40 )//if hoursWorked is greater than 40
			{//start of if statement
				
				return overtime;//returns double overtime
			
			}//end of if statement
			
			else//if hoursWorked is less than or equal to 40
			{//start of else statement
				
				return normalRate;//returns int normalRate
			
			}//end of else statement
			
			
		}//end of calculateWages()

}//end of class Wages
