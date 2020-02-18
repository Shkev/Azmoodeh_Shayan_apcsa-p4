//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover sec = new LetterRemover();
		
		sec.setRemover("I am Sam I am", 'a');
		System.out.println(sec);
		
		sec.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(sec);
		
		sec.setRemover("qwertyqwertyqwerty",  'a');
		System.out.println(sec);	
		
		sec.setRemover("abababababa",  'b');
		System.out.println(sec);
		
		sec.setRemover("abababababa",  'x');
		System.out.println(sec);
	}
}