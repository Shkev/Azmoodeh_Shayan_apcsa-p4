import java.awt.Color;

public class Wall extends Block
{	
	private static int defaultX;
	private static int defaultY;
	private static Color defaultColor;
	// default height/width for a horizontal wall
	private static int horHeight;
	private static int horWidth;
	
	static
	{
		defaultX = 10;
		defaultY = 10;
		defaultColor = Color.white;
		horHeight = 1;
		horWidth = 800;
	}
	
	public Wall(int orientation) // 0 for horizontal, 1 for vertical
	{
		super(defaultX, defaultY, horWidth, horHeight, defaultColor);
	}
	
	public Wall(Color col)
	{
		super(defaultX, defaultY, horWidth, horHeight, col);
	}
	
	public Wall(int x, int y)
	{
		super(x, y, horWidth, horHeight, defaultColor);
	}
	
	public Wall(int x, int y, Color col)
	{
		super(x, y, horWidth, horHeight, col);
	}
	
	public Wall(int x, int y, int wid, int hgt)
	{
		super(x, y, wid, hgt, defaultColor);
	}
	
	public Wall(int x, int y, int wid, int hgt, Color col)
	{
		super(x, y, wid, hgt, col);
	}
	
	// all get and set methods inherited from Block class
	
}
