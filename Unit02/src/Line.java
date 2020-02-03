public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		int y_diff = y2 - y1;
		System.out.println(y_diff);
		int x_diff = x2 - x1;
		System.out.println(x_diff);
		double slope = (double)y_diff / x_diff;
		return slope;
	}

}