package frq2016.Problem2;

public class LogMessage 
{
	private String machineId;
	private String description;
	
	/** Precondition: message is a valid log message. */ 
	public LogMessage(String message)
	{
		String[] splitMessage = message.split(":");
		machineId = splitMessage[0];
		description = splitMessage[1];
	}
	
	/** Returns true if the description in this log message properly contains keyword; 
	 * false otherwise.
	 */
	public boolean containsWord(String keyword)
	{
		if(description.contains(keyword))
		{
			//if keyword is at the end of the description
			if(description.indexOf(" " + keyword)+keyword.length() == description.length()-1)
				return true;
			else if(description.contains(" " + keyword + " "))
				return true;
			
			//if keyword is at the start of the description
			else if(description.indexOf(keyword + " ") == 0)
				return true;
		}
		return false;
	}
	
	public String getMachineId()
	{
		return machineId;
	}
	
	public String getDescription()
	{
		return description;
	}

}
