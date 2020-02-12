//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		TriangleOne Triangle = new TriangleOne();
		
		Triangle.setWord("hippo");
		Triangle.print();
		
		Triangle.setWord("abcd");
		Triangle.print();
		
		Triangle.setWord("it");
		Triangle.print();
		
		Triangle.setWord("a");
		Triangle.print();
		
		Triangle.setWord("chicken");
		Triangle.print();
	}
}