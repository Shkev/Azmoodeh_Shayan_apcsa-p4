package frq2014;

import java.util.Arrays;

public class Trio implements MenuItem
{
	
	private MenuItem sandwich;
	private MenuItem salad;
	private MenuItem drink;
	
	public Trio(Sandwich sw, Salad sal, Drink dr)
	{
		sandwich = sw;
		salad = sal;
		drink = dr;
	}
	
	public String getName()
	{
		return "" + sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio\n";
	}
	
	public double getPrice()
	{
		double[] prices = {sandwich.getPrice(), salad.getPrice(), drink.getPrice()};
		Arrays.sort(prices);
		return prices[1] + prices[2];
	}
	
	public static void main(String[] args)
	{
		Sandwich sandwich = new Sandwich("Cheeseburger", 2.75);
		Salad salad = new Salad("Spinach Salad", 1.25);
		Drink drink = new Drink("Orange Soda", 1.25);
		
		Trio trio1 = new Trio(sandwich, salad, drink);
		System.out.printf("%s $%.2f\n", trio1.getName(), trio1.getPrice());
	}
	
}
