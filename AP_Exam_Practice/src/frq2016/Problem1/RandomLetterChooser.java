package frq2016.Problem1;

import java.util.Scanner;


public class RandomLetterChooser extends RandomStringChooser
{
	
	public RandomLetterChooser(String s)
	{
		//super(getSingleLetters(s));
		setWords(getSingleLetters(s));
	}
	
	//Not given in problem but included to test code
	public String[] getSingleLetters(String s)
	{
		String[] letters = new String[s.length()];
		for(int i = 0; i < s.length(); i++)
		{
			letters[i] = s.substring(i, i+1);
		}
		return letters;
	}
	
	//to test code
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		scan.close();
		
		RandomLetterChooser test = new RandomLetterChooser(input);
		for(int i = 0; i < 4; i++)
			System.out.println(test.getNext() + " ");
	}
}
