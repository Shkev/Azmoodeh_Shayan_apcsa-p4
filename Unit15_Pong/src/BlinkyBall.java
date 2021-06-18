import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

class BlinkyBall extends Ball
{

	//constructors
	public BlinkyBall()
	{
		super();
	}

	public BlinkyBall(int x, int y)
	{
		super(x, y);
	}

	public BlinkyBall(int x, int y, int wid, int hgt)
	{
		super(x, y, wid, hgt);
	}

	public BlinkyBall(int x, int y, int wid, int hgt, int xSpd, int ySpd)
	{
		super(x, y, wid, hgt, xSpd, ySpd);
	}

	public BlinkyBall(int x, int y, int wid, int hgt, Color col, int xSpd, int ySpd)
	{
		super(x, y, wid, hgt,col, xSpd, ySpd);
	}
	
	public Color randomColor()
	{	
		int r = (int)(Math.random() * 255);		//use Math.random()
 		int g = (int)(Math.random() * 255);
 		int b = (int)(Math.random() * 255);
 		return new Color(r,g,b);
	}

	@Override
	/**
	 * Redraw ball at a new location determined by its xSpeed and ySpeed.
	 * Change the ball's color every time it is moved to give it a blinking effect
	 * @param window The window to draw the ball on
	 */
	public void moveAndDraw(Graphics window)
	{
		this.setColor(randomColor());
		super.moveAndDraw(window);
	}
}