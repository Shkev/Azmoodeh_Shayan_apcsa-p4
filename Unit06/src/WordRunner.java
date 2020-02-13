import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		
		Word Back  = new Word();
		
		Back.setString("hello");
		System.out.println(Back.getFirstChar() + "\n" + Back.getLastChar());
		System.out.println(Back);
	}
}