import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		int max = 0;
		String oldest = "";
		for (Dog pup : pups)
		{
			max = Math.max(max,  pup.getAge());
			if (max == pup.getAge())
				oldest = pup.getName();
		}
		return oldest;
	}

	public String getNameOfYoungest()
	{
		int min = -1;
		String youngest = "";
		for (Dog pup : pups)
		{
			if (min < 0) min = pup.getAge();
			min = Math.min(min, pup.getAge());
			if (min == pup.getAge())
				youngest = pup.getName();
		}
		return youngest;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}