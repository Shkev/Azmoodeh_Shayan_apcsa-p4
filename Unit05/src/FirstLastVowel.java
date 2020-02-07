public class FirstLastVowel
{
	static private char vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
	public static String go( String a )
	{
		for (int i = 0; i < 10; i++)
		{
			if (a.charAt(0) == vowels[i] || a.charAt(a.length() - 1) == vowels[i])
			{
				return "yes";
			}
		}
		return "no";
	}
}