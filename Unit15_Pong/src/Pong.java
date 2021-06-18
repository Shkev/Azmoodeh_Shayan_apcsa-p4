import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.lang.Math;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private Wall leftWall;
	private Wall rightWall;
	private Wall topWall;
	private Wall bottomWall;
	private boolean[] keys;
	private BufferedImage back;
	
	private int leftScore;
	private int rightScore;


	public Pong()
	{
		//set up all variables related to the game
		ball = initializeBall();
		leftPaddle = new Paddle();
		rightPaddle = new Paddle(770, 10); // on the right edge of playing screen
		leftWall = new Wall(leftPaddle.getX(), leftPaddle.getY(), 1, 600);
		rightWall = new Wall(770 + rightPaddle.getWidth(), rightPaddle.getY(), 1, 600);
		topWall = new Wall(0, 10);
		bottomWall = new Wall(0, 560);
		
		setLeftScore(0);
		setRightScore(0);

		keys = new boolean[4];

    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this); //starts the key thread to log key strokes
	}
	
	// set and get methods
	public void setLeftScore(int score)
	{
		leftScore = score;
	}
	
	public void setRightScore(int score)
	{
		rightScore = score;
	}
	
	public int getLeftScore()
	{
		return leftScore;
	}
	
	public int getRightScore()
	{
		return rightScore;
	}
	
	public Ball initializeBall()
	{
		// creating new ball object
		// randomizing starting position and starting movement direction
		Ball newBall = new SpeedUpBall((int)(Math.random()*100 + 250), (int)(Math.random()*100+250));
		newBall.setXSpeed(newBall.getXSpeed() * (int)Math.pow(-1, Math.round(Math.random())));
		newBall.setYSpeed(newBall.getYSpeed() * (int)Math.pow(-1, Math.round(Math.random())));
		return newBall;
	}
	
	// graphics methods
	public void update(Graphics window)
	{
		paint(window);
		window.setFont(new Font("Monospaced", Font.BOLD, 18)); 
		window.drawString("Score:\n" + leftScore + "\t|\t" + rightScore + "\n", 340, 30);
	}
   
	/**
	 * Restarts game. Puts ball in motion, resets position of paddles, and adds a point to the player that won the last round.
	 * @param window The window to draw the game on
	 */
	public void gameRestart(Graphics window)
	{
	   
		// updating score
		if(ball.getX() <= 17)
		{
			rightScore++;
		}
		else
		{
			leftScore++;
		}
	   
		// wait 1 second before restarting the game
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// restarting ball
		ball.setColor(Color.white);
		ball.draw(window);
		ball = initializeBall();
	   
		// restarting paddles
		leftPaddle.drawWhite(window, leftPaddle.getX(), leftPaddle.getY());
		leftPaddle = new Paddle();
		rightPaddle.drawWhite(window, rightPaddle.getX(), rightPaddle.getY());
		rightPaddle = new Paddle(770, 10);
		leftPaddle.draw(window);
		rightPaddle.draw(window);
	}
   
	/**
	 * Controls movement of ball and paddles. Ball movements changes when it collides with another object.
	 * Paddles move up and down based user keystrokes.
	 * @param window The window to draw the game on
	 */
	public void paint(Graphics window)
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		// adding walls to window
		leftWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		topWall.draw(graphToBack);
		bottomWall.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(ball.didCollideRight(rightWall) || ball.didCollideLeft(leftWall))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			gameRestart(graphToBack);
		}

		//changing ball's motion when it collides with something
		
		//see if the ball hits the top or bottom wall
		if(ball.didCollideTop(topWall) || ball.didCollideBottom(bottomWall))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the ball hits the left paddle
		if(ball.didCollideLeft(leftPaddle))
		{
			// if the ball hits the top of the paddle (the short side)
			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(-ball.getYSpeed());
			}
			else
			{
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		
		
		//see if the ball hits the right paddle
		if(ball.didCollideRight(rightPaddle))
		{
			// if the ball hits the top of the paddle
			if(ball.getX() >= rightPaddle.getX() + Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(-ball.getYSpeed());
			}
			else
			{
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			//move right paddle up and draw it on the window
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			//move right paddle down and draw it on the window
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}
	
	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
	public void run()
	{
		try
		{
			while(true)
			{
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch(Exception e)
		{
		}
	}	
}