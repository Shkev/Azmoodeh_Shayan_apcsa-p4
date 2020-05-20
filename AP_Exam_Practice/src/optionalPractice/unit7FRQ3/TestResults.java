package optionalPractice.unit7FRQ3;

import java.util.ArrayList;

public class TestResults 
{

	private ArrayList<StudentAnswerSheet> sheets;
	
	
	public TestResults()
	{
		sheets = new ArrayList<StudentAnswerSheet>();
	}
	
	public TestResults(ArrayList<StudentAnswerSheet> students)
	{
		sheets = students;
	}
	
	/** @param key is ArrayList of correct answers represented with string of length one.
	 * @return name of student with the highest score */
	public String highestScoringStudent(ArrayList<String> key)
	{
		String[] students = new String[sheets.size()];
        double[] scores = new double[sheets.size()];
        for(int i = 0; i < sheets.size(); i++)
        {
        	scores[i] = sheets.get(i).getScore(key);
        	students[i] = sheets.get(i).getName();
        }
        double max = scores[0];
        int index = 0;
        for(int i = 0; i < scores.length; i++)
        {
        	max = Math.max(max, scores[i]);
        	if(max == scores[i])
        		index = i;
        }
        return students[index];
	}
	
	/** To test code */
	public static void main(String[] args)
	{
		ArrayList<String> key = new ArrayList<String>();
		key.add("A");
		key.add("B");
		key.add("C");
		
		ArrayList<StudentAnswerSheet> students = new ArrayList<StudentAnswerSheet>();
		students.add(new StudentAnswerSheet("Bob", new String[] {"A", "B", "C"}));
		students.add(new StudentAnswerSheet("Bill", new String[] {"B", "B", "B"}));
		students.add(new StudentAnswerSheet("Jill", new String[] {"C", "B", "C"}));
		
		TestResults test = new TestResults(students);
		System.out.println(test.highestScoringStudent(key));
	}
	
}
