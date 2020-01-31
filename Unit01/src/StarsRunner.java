import static java.lang.System.*;
import java.util.Random;

public class StarsRunner
{
   public static void main(String args[])
   {
	   StarsAndStripes Stars = new StarsAndStripes();
	   Random rand = new Random();
	   int rand_int;
	   for (int i = 0; i < 10; i++)
	   {
		   rand_int = rand.nextInt(8);
		   if (rand_int == 0 || rand_int == 1)
		   {
			   Stars.printTwentyStars();
		   }
		   if (rand_int == 2 || rand_int == 3)
		   {
			   Stars.printTwentyDashes();
		   }
		   if (rand_int == 4 || rand_int == 5)
		   {
			   Stars.printTwoBlankLines();
		   }
		   if (rand_int == 6)
		   {
			   Stars.printASmallBox();
		   }
		   if (rand_int == 7)
		   {
			   Stars.printABigBox();
		   }
	   }
   }
}