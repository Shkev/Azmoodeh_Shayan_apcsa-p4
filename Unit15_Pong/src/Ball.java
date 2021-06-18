import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;
	
	private static int defaultX;
	private static int defaultY;
	private static int defaultXSpeed;
	private static int defaultYSpeed;
	
	static
	{
		defaultX = 200;
		defaultY = 200;
		defaultXSpeed = 3;
		defaultYSpeed = 1;
	}

	public Ball()
	{
		super(defaultX, defaultY); // default starting position is (200, 200)
		setDefaultSpeed();
	}
	
	public Ball(Color col)
	{
		super(defaultX, defaultY);
		setDefaultSpeed();
	}

	public Ball(int x, int y)
	{
		super(x, y);
		setDefaultSpeed();
	}
	
	public Ball(int x, int y, int wid, int hgt)
	{
		super(x, y, wid, hgt);
		setDefaultSpeed();
	}
	
	public Ball(int x, int y, int wid, int hgt, int xSpd, int ySpd)
	{
		super(x, y, wid, hgt);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	
	public Ball(int x, int y, Color col)
	{
		super(x, y, col);
		setDefaultSpeed();
	}

	public Ball(int x, int y, int wid, int hgt, Color col)
	{
		super(x, y, wid, hgt, col);
		setDefaultSpeed();
	}
	
	public Ball(int x, int y, int wid, int hgt, Color col, int xSpd)
	{
		super(x, y, wid, hgt, col);
		setXSpeed(xSpd);
		setYSpeed(defaultYSpeed);
	}
	
	public Ball(int x, int y, int wid, int hgt, Color col, int xSpd, int ySpd)
	{
		super(x, y, wid, hgt, col);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	
	// set methods
	// methods for other variables inherit from Block class
	public void setXSpeed(int x)
	{
		xSpeed = x;
	}
   
	public void setYSpeed(int y)
	{
		ySpeed = y;
	}
	
	public void setDefaultSpeed()
	{
		setXSpeed(defaultXSpeed);
		setYSpeed(defaultYSpeed);
	}
	
	/**
	 * Redraw ball at a new location determined by its xSpeed and ySpeed
	 * @param window The window to draw the ball on
	 */
	public void moveAndDraw(Graphics window)
	{
		//draw a white ball at old ball location
		Ball white = new Ball(getX(), getY(), Color.white);
		white.draw(window);
		
		// set new X
		setX(getX() + xSpeed);
		
		//set new Y
		setY(getY() + ySpeed);
		
		
		//draw the ball at its new location
		this.draw(window);
	}
	
	// interface methods
	public boolean didCollideLeft(Object obj)
	{
		Block p = (Block) obj;
		return getX() <= p.getX() + p.getWidth() + Math.abs(xSpeed) &&
				((getY() >= p.getY() && getY() <= p.getY() + p.getHeight()) ||
						(getY() + getHeight() >= p.getY() && getY() + getHeight() < p.getY() + p.getHeight()));
	}
	
	public boolean didCollideRight(Object obj)
	{
		Block p = (Block) obj;
		return getX() + getWidth() >= p.getX() - Math.abs(xSpeed) &&
				((getY() >= p.getY() && getY() <= p.getY() + p.getHeight()) ||
						(getY() + getHeight() >= p.getY() && getY() + getHeight() < p.getY() + p.getHeight()));
	}
	
	public boolean didCollideTop(Object obj)
	{
		Block w = (Block) obj;
		return getY() <= w.getY();
	}
	
	public boolean didCollideBottom(Object obj)
	{
		Block w = (Block) obj;
		return getY() >= w.getY();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == this) return true;
		Ball b = (Ball) obj;
		return super.equals(obj) && b.xSpeed == this.xSpeed && b.ySpeed == this.ySpeed;
	}

	// get methods
	// methods for other variables inherit from Block class
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + String.format(", %d, %d", xSpeed, ySpeed);
	}
}