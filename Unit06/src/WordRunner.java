import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		
		Word Back  = new Word();
		
		Back.setString("Hello");
		System.out.println(Back.getFirstChar() + "\n" + Back.getLastChar());
		System.out.println(Back + "\n" + "Hello\n");
		
		Back.setString("World");
		System.out.println(Back.getFirstChar() + "\n" + Back.getLastChar());
		System.out.println(Back + "\n" + "World\n");
		
		Back.setString("JukeBox");
		System.out.println(Back.getFirstChar() + "\n" + Back.getLastChar());
		System.out.println(Back + "\n" + "JukeBox\n");
		
		Back.setString("TCEA");
		System.out.println(Back.getFirstChar() + "\n" + Back.getLastChar());
		System.out.println(Back + "\n" + "TCEA\n");
		
		Back.setString("UIL");
		System.out.println(Back.getFirstChar() + "\n" + Back.getLastChar());
		System.out.println(Back + "\n" + "UIL\n");
	}
}