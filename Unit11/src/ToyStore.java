//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] toysArr = toys.split(" ");
		for (String toyName : toysArr)
		{
			toyList.add(new Toy(toyName));
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy toy : toyList)
  		{
  			if (toy.getName().equals(nm))
  				return toy;
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		ArrayList<Toy> tmp = new ArrayList(toyList);
  		int loc, count;
  		for (Toy item : tmp)
  		{
  			loc = count = 0;
  			while(loc > -1)
  			{
  				loc = tmp.indexOf(item);
  				if (loc > -1)
  					tmp.remove(loc);
  				count++;
  			}
  		}
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}