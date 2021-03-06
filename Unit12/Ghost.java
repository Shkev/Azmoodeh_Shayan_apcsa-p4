import static java.lang.System.*; 

public class Ghost implements Monster
{
    private String name;	
    private int size;

    public Ghost()
    {
    	name = "";
    	size = 0;
    }

    public Ghost(String nm, int s)
    {
    	setMonster(nm, s);
    }

    public void setMonster(String nm, int s)
    {
    	setName(nm);
    	setSize(s);
    }

    public void setName(String nm)
    {
    	name = nm;
    }

    public void setSize(int s)
    {
    	size = s;
    }
    
    public int getHowBig()
    {
    	return size;
    }

    public String getName()
    {
    	return name;
    }

    public boolean isBigger(Monster other)
    {
    	return size > other.getHowBig();
    }

    public boolean isSmaller(Monster other)
    {
    	return size < other.getHowBig();
    }

    public boolean namesTheSame(Monster other)
    {
    	return name.equals(other.getName());
    }

    public String toString()
    {
    	return "" + name + " " + size + "\n";
    }
}
