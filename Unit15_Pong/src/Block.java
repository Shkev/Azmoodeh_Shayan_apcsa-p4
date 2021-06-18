import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	
	private Color color;
	
	private static int defaultX;
	private static int defaultY;
	private static int defaultHeight;
	private static int defaultWidth;
	private static Color defaultColor;

	static
	{
		defaultX = 100;
		defaultY = 150;
		defaultHeight = 10;
		defaultWidth = 10;
		defaultColor = Color.black;
	}
	
	public Block()
	{
		setX(defaultX);
		setY(defaultY);
		setHeight(defaultHeight);
		setWidth(defaultWidth);
		setColor(defaultColor);
	}

	public Block(int x, int y)
	{
		setX(x);
		setY(y);
		setHeight(defaultHeight);
		setWidth(defaultWidth);
		setColor(defaultColor);
	}
	
	public Block(int x, int y, Color col)
	{
		setX(x);
		setY(y);
		setHeight(defaultHeight);
		setWidth(defaultWidth);
		setColor(col);
	}

	public Block(int x, int y, int wid, int hgt)
	{
		setX(x);
		setY(y);
		setWidth(wid);
		setHeight(hgt);
		setColor(defaultColor);
	}
	
	public Block(int x, int y, int wid, int hgt, Color col)
	{
		setX(x);
		setY(y);
		setWidth(wid);
		setHeight(hgt);
		setColor(col);
	}

	// setter functions
	public void setColor(Color col)
	{
		color = col;
	}		

	public void setX(int x)
	{
		xPos = x;
	}
   
	public void setY(int y)
	{
		yPos = y;
	}
   
	public void setPos(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
   
	public void setWidth(int wid)
	{
		width = wid;
	}
   
	public void setHeight(int hgt)
	{
		height = hgt;
	}
   
	// getter functions
	public Color getColor()
	{
		return color;
	}
   
	public int getX()
	{
		return xPos;
	}
   
	public int getY()
	{
		return yPos;
	}
   
	public int getHeight()
	{
		return height;
	}
   
	public int getWidth()
	{
		return width;
	}
   
	/**
	 * Draw block
	 * @param window
	 */
	public void draw(Graphics window)
	{
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	/**
	 * Draw block with a certain color
	 * @param window
	 * @param col The color to make the block
	 */
	public void draw(Graphics window, Color col)
	{
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	/**
	 * Checks if the current object (this) has the same attributes at the given obj.
	 * @param obj The object to compare with this.
	 * @return true if this is equal to obj and false otherwise.
	 */
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		Block b = (Block) obj;
		return b.xPos == this.xPos && b.yPos == this.yPos && b.height == this.height && b.width == this.width &&
				b.color == this.color;
	}

	public String toString()
	{
		return "" + String.format("%d, %d, %d, %d, ", xPos, yPos, width, height) + color;
	}
}