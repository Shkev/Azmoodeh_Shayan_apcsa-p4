//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;
import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.print("Enter an upper limit :: ");
	   int num = scan.nextInt();
	   
	   Triples test = new Triples(num);
	   System.out.print(test);
	   
	   
   }
}