/*

USING AN 'IF...ELSE' STATEMENT
----------------------------

Class name: 	AssignVolunteer3
File name: 		AssignVolunteer3.java
Date:			27.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 5-MAKING DECISIONS 'You Do IT' - p.252

Description: 	An app to assign a volunteer to price an item based on the condition of an 'if...else' statement
 
 */

import java.util.Scanner;

public class AssignVolunteer4 
{
	public static void main (String[] args)
	{
		int donationType;
		String volunteer = "";
		final int CLOTHING_CODE = 1;
		final int FURNITURE_CODE = 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;
		final String CLOTHING_PRICER = "Regina";
		final String FURNITURE_PRICER = "Walter";
		final String ELECTRONICS_PRICER = "Lydia";
		final String OTHER_PRICER = "Marco";
		final String NO_PRICER = "DEAD!";
		String message;

		Scanner input = new Scanner(System.in);
		System.out.println("What type of donation is this?");
		System.out.println("Enther an integer >> ");
		donationType = input.nextInt();


		switch(donationType)
		{ 

			case(CLOTHING_CODE):
				volunteer = CLOTHING_PRICER;
				message = "a clothing donation";
				break;
			case(FURNITURE_CODE):
				volunteer = FURNITURE_PRICER;
				message = "a furniture donation";
				break;
			case(ELECTRONICS_CODE):
				volunteer = ELECTRONICS_PRICER;
				message = "an electronics donation";
				break;
			case(OTHER_CODE):
				volunteer = OTHER_PRICER;
				message = "another donation";
				break;
			default:
				volunteer = "!DEAD";
				message= "an invalid donation type";

		}


		System.out.println("You entered "+donationType+".");
		System.out.println("The assistant who will help you is "+volunteer+".");
		System.out.println("This is " + message);

	}
}