//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		double num = Math.random();
		if (num >= 0 && num < 1.0/3) compChoice = "R";
		if (num >= 1.0/3 && num < 2.0/3) compChoice = "P";
		if (num >= 2.0/3 && num <= 1) compChoice = "S";
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice.equals(compChoice))
			winner = "!Draw Game!\n";
		else if (playChoice.equals("R"))
		{
			if (compChoice.equals("P"))
				winner = "!Computer Wins <<Paper covers rock>>!";
			else if (compChoice.equals("S"))
				winner = "!Player Wins <<Rock Breaks Scissors>>!";
		}
		else if (playChoice.equals("P"))
		{
			if (compChoice.equals("R"))
				winner = "!Player Wins <<Paper covers rock>>!";
			else if (compChoice.equals("S"))
				winner = "!Computer Wins <<Scissors Cut Paper>>!";
		}
		else if (playChoice.equals("S"))
		{
			if (compChoice.equals("R"))
				winner = "!Computer Wins <<Rock Breaks Scissors>>!";
			else if (compChoice.equals("P"))
				winner = "!Player Wins <<Scissors Cut Paper>>!";
		}
		return winner;
	}

	public String toString()
	{
		String output="";
		output = determineWinner();
		return output + "\n";
	}
}