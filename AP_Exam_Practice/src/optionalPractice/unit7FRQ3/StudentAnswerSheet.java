package optionalPractice.unit7FRQ3;

import java.util.ArrayList;

public class StudentAnswerSheet 
{
	private ArrayList<String> answers;
	private String studentName;
	
	public StudentAnswerSheet()
	{
		answers = new ArrayList<String>();
		studentName = "";
	}
	
	public StudentAnswerSheet(String name, ArrayList<String> ans)
	{
		answers = ans;
		studentName = name;
	}
	
	public StudentAnswerSheet(String name, String[] ans)
	{
		answers = new ArrayList<String>();
		for(String item : ans)
			answers.add(item);
		studentName = name;
	}
	
	/**@param key the list of correct answers. Strings of length one.
	 * @return Student's score on the test; correct answer is +1,
	 * wrong answer -0.25 and blank answer +0 */
	public double getScore(ArrayList<String> key)
	{
		double score = 0;
        for(int i = 0; i < answers.size(); i++)
        {
        	if(answers.get(i).equals(key.get(i)))
        		score++;
        	else if(!answers.get(i).equals("?"))
        		score -= 0.25;
        }
        return score;
	}
	
	public String getName()
	{
		return studentName;
	}
	
}
