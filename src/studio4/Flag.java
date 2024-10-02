package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(255,150,0);
		StdDraw.filledRectangle(.5, .5, .5,.25);
		StdDraw.setPenColor(150,150,0);
		StdDraw.filledRectangle(.25,.5,.15,.15);
		StdDraw.filledRectangle(.75,.5,.15,.15);
		StdDraw.setPenColor(200,50,0);
		StdDraw.filledCircle(.5,.5, .25);
		StdDraw.setPenColor(0,10,255);
		StdDraw.setPenRadius(.05);
		StdDraw.line(0,.25,1,.75);
		StdDraw.line(1,.25,0,.75);
		StdDraw.setPenColor(200,200,0);
		StdDraw.filledCircle(.5,.5 ,.05);
		StdDraw.setPenColor(200,0,200);
		StdDraw.filledCircle(0,.5 ,.05);
		StdDraw.filledCircle(1,.5 ,.05);





	}
}