import java.awt.Color;
import java.awt.Graphics;

class SpeedUpBall extends Ball
{

	private double speedDelta = 0.05; // how much to change speed with each collision;

	public SpeedUpBall()
	{
		super();
	}

	public SpeedUpBall(int x, int y)
	{
		super(x, y);
	}


	public SpeedUpBall(int x, int y, int xSpd, int ySpd)
	{
		super(x, y);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}

	public SpeedUpBall(int x, int y, int wid, int hgt, int xSpd, int ySpd)
	{
		super(x, y, wid, hgt, xSpd, ySpd);
	}


	public SpeedUpBall(int x, int y, int wid, int hgt, Color col, int xSpd, int ySpd)
	{
		super(x, y, wid, hgt, col, xSpd, ySpd);
	}
	
	/**
	 * Speeds up ball if it collided with another object. If speed is positive, it adds to speed.
	 * If speed is negative it subtracts from speed (abs value of speed increases).
	 * @param didCollide true if the ball collided with another object. false otherwise.
	 */
	public void changeSpeed(boolean didCollide)
	{
		if(didCollide)
		{
			if(getXSpeed() >= 0) setXSpeed(getXSpeed()+1);
			else if(getXSpeed() < 0) setXSpeed(getXSpeed()-1);
			if(getYSpeed() >= 0) setYSpeed(getYSpeed()+1);
			else if(getYSpeed() < 0) setYSpeed(getYSpeed()-1);
		}
	}
	
	@Override
	public boolean didCollideTop(Object obj)
	{
		boolean didCollide = super.didCollideTop(obj);
		changeSpeed(didCollide);
		return didCollide;
	}
	
	@Override
	public boolean didCollideBottom(Object obj)
	{
		boolean didCollide = super.didCollideBottom(obj);
		changeSpeed(didCollide);
		return didCollide;
	}
	
	@Override
	public boolean didCollideLeft(Object obj)
	{
		boolean didCollide = super.didCollideLeft(obj);
		changeSpeed(didCollide);
		return didCollide;
	}
	
	@Override
	public boolean didCollideRight(Object obj)
	{
		boolean didCollide = super.didCollideRight(obj);
		changeSpeed(didCollide);
		return didCollide;
	}
	
}