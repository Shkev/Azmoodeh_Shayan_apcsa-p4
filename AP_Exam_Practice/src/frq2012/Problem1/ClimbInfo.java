package frq2012.Problem1;


public class ClimbInfo 
{
	/** Creates a ClimbInfo object with name peakName and time climbTime.
	* @param peakName the name of the mountain peak
	* @param climbTime the number of minutes taken to complete the climb
	*/
	
	private String peakName;
	private int climbTime;
	
	public ClimbInfo(String name, int time)
	{
		setName(name);
		setTime(time);
	}
	
	public void setName(String name)
	{
		peakName = name;
	}
	
	public void setTime(int time)
	{
		climbTime = time;
	}
	
	/** @return the name of the mountain peak */
	public String getName()
	{
		return peakName;
	}
	
	/** @return the number of minutes taken to complete the climb */
	public int getTime()
	{
		return climbTime;
	}
	
	public String toString()
	{
		return this.getName() + " " + this.getTime();
	}
}
