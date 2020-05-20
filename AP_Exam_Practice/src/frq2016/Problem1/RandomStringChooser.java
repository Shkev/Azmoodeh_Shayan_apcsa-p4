package frq2016.Problem1;


public class RandomStringChooser 
{
	
	private String[] words;
	private String[] randWords;
	
	public RandomStringChooser()
	{
		setWords(new String[0]);
	}
	
	public RandomStringChooser(String[] str)
	{
		setWords(str);
	}
	
	public void setWords(String[] str)
	{
		words = str;
		randWords = str;
	}
	
	public String getNext()
	{
		String output = "NONE";
		boolean isNull = true;
		for(String item : randWords)
		{
			if(item != null)
			{
				isNull = false;
				break;
			}
		}
		if(isNull == false)
		{
			int index = (int)(Math.random()*words.length);
			while(randWords[index] == null)
				index = (int)(Math.random()*words.length);
			output = randWords[index];
			randWords[index] = null;
		}
		return output;
	}
	
	//to test code
	public static void main(String[] args)
	{
		String[] wordArr = {"wheels", "on", "the", "bus"};
		
		RandomStringChooser test = new RandomStringChooser(wordArr);
		for(int i = 0; i < 4; i++)
			System.out.println(test.getNext() + " ");
	}
}