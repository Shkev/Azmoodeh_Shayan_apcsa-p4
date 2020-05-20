package frq2014;

public class Salad implements MenuItem
{
	
	private String name;
	private double price;
	
	public Salad()
	{
		setName("");
		setPrice(0);
	}
	
	public Salad(String n, double p)
	{
		setName(n);
		setPrice(p);
	}
	
	public void setName(String s)
	{
		name = s;
	}
	
	public void setPrice(double p)
	{
		price = p;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}

}
