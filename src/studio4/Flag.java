package studio4;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	
	public static void main(String[] args) {

		StdDraw.setPenColor(0, 200, 2);
		StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.1);
		StdDraw.setPenColor(200, 0, 0);
		StdDraw.filledEllipse(0.5, 0.5, 0.1, 0.1);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledEllipse(0.5, 0.5, 0.05, 0.05);
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(0.5, 0.5, 0.2, 0.1);
	}
		
}