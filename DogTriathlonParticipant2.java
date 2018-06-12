/*

USING STATIC AND NON-STATIC final FIELDS
----------------------------------------

Class name: 	DogTriathlonParticipant
File name: 		DogTriathlonParticipant.java
Date:			24.01.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'You Do It' - p.217

Description: 	This exercise demonstrates the use of static and non-static fields in a class

 
 */

public class DogTriathlonParticipant2
{
	private final int NUM_EVENTS;
	private static int totalCumulativeScore = 0;
	private String name;
	private int obedienceScore;
	private int conformationScore;
	private int agilityScore;
	private int total;
	private double avg;
	private boolean scoresAgree;

	public DogTriathlonParticipant2(String name, int numEvents, 
									int score1, int score2, int score3)
	{
		this.name = name;
		NUM_EVENTS = numEvents;
		//obedienceScore = score1;
		//conformationScore = score2;
		//agilityScore = score3;
		int totalNot0 = 0;
		if(score1 != 0)
			totalNot0 = totalNot0 + 1;
		if(score2 != 0)
			totalNot0 = totalNot0 + 1;
		if(score3 != 0)
			totalNot0 = totalNot0 + 1;

		if (numEvents == totalNot0)
			scoresAgree = true;
		else
			scoresAgree = false;

		if(scoresAgree)
		{
			obedienceScore = score1;
			conformationScore = score2;
			agilityScore = score3;
		} 
		else
		{
			obedienceScore = 0;
			conformationScore = 0;
			agilityScore = 0;
		}


		total = obedienceScore + conformationScore + agilityScore;
		//avg = (double)total / NUM_EVENTS;
		if(NUM_EVENTS == 0)
		{
			avg = 0;
		} 
		else
		{
			avg = (double)total / NUM_EVENTS;
		}
		totalCumulativeScore = totalCumulativeScore + total;
	}

	public void display()
	{
		System.out.println(name + " participated in " + NUM_EVENTS + 
								" events and has an average score of " + avg);
		System.out.println(" " + name + " has a total score of " + total +
							" bringing the total cumulative score to " + 
							totalCumulativeScore);
		System.out.println("\nNotice! Number of events for " + name + " does not agree with the scores reported!");

	}
}