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
	private ArrayList<String> names;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
		names = new ArrayList<String>();
	}

	public void loadToys( String toys )
	{
		String[] toysArr = toys.split(" ");
		for(String toyName : toysArr)
		{
			if(!names.contains(toyName))
				toyList.add(new Toy(toyName));
			names.add(toyName);
		}
		for(Toy item : toyList)
		{
			item.setCount(findCount(item));
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

  	public int findCount(Toy item)
  	{
  		int loc;
  		int count = 0;
			ArrayList<String> namesTmp = new ArrayList<String>(names);
  		loc = namesTmp.indexOf(item.getName());
  		while(loc > -1)
  		{
  			count++;
  			namesTmp.remove(loc);
  			loc = namesTmp.indexOf(item.getName());
  		}
  		return count;
  	}

  	public String getMostFrequentToy()
  	{
			String res = "";
			int max_count, curr_count;
			max_count = curr_count = toyList.get(0).getCount();
			res = toyList.get(0).getName();
			for(Toy item : toyList)
			{
				curr_count = item.getCount();
				if(curr_count > max_count)
				{
					res = item.getName();
					max_count = curr_count;
				}
			}
			System.out.println(res);
			return res;
		}

  	public void sortToysByCount()
  	{
			//sorted from high to low frequency
			for(int i = 0; i+1 < toyList.size(); i++)
			{
				for(int j = i+1; j < toyList.size(); j++)
				{
					if(toyList.get(i).getCount() < toyList.get(j).getCount())
					{
						Toy tmp = toyList.get(i);
						toyList.set(i, toyList.get(j));
						toyList.set(j, tmp);
					}
				}
			}
  	}

	public String toString()
	{
		//returns sorted arraylist of toys
		sortToysByCount();
	   return Arrays.toString(toyList.toArray());
	}
}
