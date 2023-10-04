package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {	
		Color red = new Color(188,0,45);
		StdDraw.setPenColor(red);
		StdDraw.setPenRadius(0.07);
		StdDraw.filledEllipse(0.5, 0.5, 0.1, 0.1);
		Color black = new Color(0,0,0);
		StdDraw.setPenColor(black);
		StdDraw.setPenRadius(0.001);
		StdDraw.rectangle(0.5,0.5,0.3,0.2);
		
		
	}
}