package frq2016.Problem2;

import java.util.ArrayList;
import java.util.List;

public class SystemLog
{
	
	/** Contains all the entries in this system log.
	 *	Guaranteed not to be null and to contain only non-null entries. 
	 */
   private List<LogMessage> messageList;
	   
   public SystemLog()
   {
	   messageList = new ArrayList<LogMessage>();
   }
   
   public SystemLog(List<LogMessage> messages)
   {
	   messageList = messages;
   }
   
   public SystemLog(LogMessage[] messages)
   {
	   messageList = new ArrayList<LogMessage>();
	   for(LogMessage item : messages)
	   {
		   messageList.add(item);
	   }
   }
   
   /** 	Removes from the system log all entries whose descriptions properly contain keyword, 
    *	and returns a list (possibly empty) containing the removed entries.
	*	Postcondition:
	*	Entries in the returned list properly contain keyword and
    * 	are in the order in which they appeared in the system log.
	*	The remaining entries in the system log do not properly contain keyword and
    * 	are in their original order.
	*	The returned list is empty if no messages properly contain keyword. 
	**/
   
   public List<LogMessage> removeMessages(String keyword)
   {
	   List<LogMessage> outputLog = new ArrayList<LogMessage>();
	   for(int i = 0; i < messageList.size(); i++)
	   {
		   if(messageList.get(i).containsWord(keyword))
		   {
			   outputLog.add(messageList.remove(i));;
			   i--;
		   }
	   }
	   return outputLog;
   }
   
   public static void main(String[] args)
   {
	   List<LogMessage> messages = new ArrayList<LogMessage>();
	   messages.add(new LogMessage("CLIENT3:security alert – repeated login failures"));
	   messages.add(new LogMessage("Webserver:disk offline"));
	   messages.add(new LogMessage("SERVER1:file not found"));
	   messages.add(new LogMessage("SERVER2:read error on disk DSK1"));
	   messages.add(new LogMessage("SERVER1:write error on disk DSK2"));
	   messages.add(new LogMessage("Webserver:error on /dev/disk"));
	   messages.add(new LogMessage("Webserver:good on disk"));
	   SystemLog theLog = new SystemLog(messages);
	   
	   List<LogMessage> outputLog = theLog.removeMessages("disk");
	   for(LogMessage item : outputLog)
	   {
		   System.out.println(item.getMachineId() + ":" + item.getDescription());
	   }
   }

}