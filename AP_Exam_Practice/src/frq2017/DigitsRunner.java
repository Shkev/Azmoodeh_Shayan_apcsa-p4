package frq2017;

import java.util.Scanner;

public class DigitsRunner 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		scan.close();
	
		Digits test = new Digits(input);
		System.out.println(test.isStrictlyIncreasing());
	}
}
