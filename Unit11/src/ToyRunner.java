//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test = new Toy("Sorry");
		
		test.setCount(1);
		System.out.println(test);
		
		test.setName("ji goe");
		test.setCount(5);
		System.out.println(test);
	}
}