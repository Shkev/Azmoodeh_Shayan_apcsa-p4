//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
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
  		String res = toyList.get(0).getName();
  		int max_count = 1, count = 1;
  		String[] names = new String[toyList.size()];
  		for(int i = 0; i < toyList.size(); i++)
  		{
  			names[i] = toyList.get(i).getName();
  		}
  		Arrays.sort(names);
  		for(int i = 1; i < names.length; i++)
  		{
  			if(names[i].equals(names[i+1]))
  				count++;
  			else 
  			{
  				if(count > max_count)
  				{
  					max_count = count;
  					res = names[i];
  				}
  				count++;
  			}
  		}
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> tmp = new ArrayList(toyList);
  		int loc, count;
  		for(Toy item : tmp)
  		{
  			count = loc = 0;
  			while(loc > -1)
  			{
  				loc = tmp.indexOf(item);
  				tmp.remove(loc);
  				count++;
  			}
  			toyList.get(toyList.indexOf(item)).setCount(count);
  		}
  	}  
  	
	public String toString()
	{
	   return "";
	}
}