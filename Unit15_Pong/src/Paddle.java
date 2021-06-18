import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

public class Paddle extends Block
{
	//instance variables
	private int speed;
	private static int defaultSpeed;
	private static int defaultX;
	private static int defaultY;
	private static int defaultHeight;
	private static int defaultWidth;
	private static Color defaultColor;
	
	static
	{
		defaultSpeed = 5;
		defaultX = 10;
		defaultY = 10;
		defaultHeight = 70;
		defaultWidth = 15;
		defaultColor = Color.red;
	}

	public Paddle()
	{
		super(defaultX, defaultY, defaultWidth, defaultHeight, defaultColor);
		setSpeed(defaultSpeed);
	}

	public Paddle(int x, int y)
	{
		super(x, y, defaultWidth, defaultHeight, defaultColor);
		setSpeed(defaultSpeed);
	}
	
	public Paddle(int x, int y, Color col)
	{
		super(x, y, defaultWidth, defaultHeight, col);
		setSpeed(defaultSpeed);
	}
	
	public Paddle(int x, int y, int spd)
	{
		super(x, y, defaultWidth, defaultHeight, defaultColor);
		setSpeed(spd);
	}
	
	public Paddle(int x, int y, int wid, int hgt, int spd)
	{
		super(x, y, wid, hgt, defaultColor);
		setSpeed(spd);
	}
	
	public Paddle(int x, int y, int wid, int hgt, Color col, int spd)
	{
		super(x, y, wid, hgt, col);
		setSpeed(spd);
	}
	
	// set methods
	public void setSpeed(int s)
	{
		speed = s;
	}

	/**
	 * Draws a white paddle at the given (x, y) coordinates
	 * @param window
	 * @param x x coordinate for white paddle
	 * @param y y coordinate for white paddle
	 */
	public void drawWhite(Graphics window, int x, int y)
	{
		Paddle white = new Paddle(x, y, Color.white);
		white.draw(window);
	}

	/**
	 * Redraws paddle higher than it was previously
	 * @param window
	 */
	public void moveUpAndDraw(Graphics window)
	{
		//draw a white paddle at old paddle location
		drawWhite(window, getX(), getY());

		// change y positions of paddle
		// x doesn't change because paddle only moves up and down
		setY(Math.max(getY() - speed, 0));
		
		// draw paddle at new location
		draw(window);
	}

	/**
	 * Redraws paddle lower than it was previously
	 * @param window
	 */
	public void moveDownAndDraw(Graphics window)
	{
		//draw a white paddle at old paddle location
		drawWhite(window, getX(), getY());
		
		// change y position of paddle
		setY(Math.min(getY() + speed, 560-getHeight()));
		
		// draw paddle at new location
		draw(window);
	}

	// get methods
	public int getSpeed()
	{
		return speed;
	}
   
	@Override
   public String toString()
   {
	   return super.toString() + ", " + speed;
   }
}