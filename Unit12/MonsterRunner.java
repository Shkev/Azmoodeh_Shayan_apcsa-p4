//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter Skeleton's name: ");
		String name = keyboard.next();
		System.out.print("Enter Skeleton's size: ");
		int size = keyboard.nextInt();
		
		Skeleton skel = new Skeleton(name, size);

		System.out.print("Enter Ghost's name: ");
		name = keyboard.next();
		System.out.print("Enter Ghost's size: ");
		size = keyboard.nextInt();
		
		Ghost ghost = new Ghost(name, size);

		if(skel.isBigger(ghost))
		    System.out.println("Skeleton is bigger than Ghost");
		else
		    System.out.println("Skeleton is smaller than Ghost");
		if(skel.namesTheSame(ghost))
		    System.out.println("Skeleton has the same name as Ghost");
		else
		    System.out.println("Skeleton does not have the same name as Ghost");
	}
}
