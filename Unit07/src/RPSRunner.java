//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response = 'y';
		while (response == 'y')
		{
			String player = "";
			out.print("type in your prompt [R,P,S] :: ");
			player = keyboard.next();
			RockPaperScissors game = new RockPaperScissors(player);
			game.determineWinner();
			System.out.print(game);
			
			System.out.print("Do you want to play again?");
			response = keyboard.next().charAt(0);
		}
	}
}



