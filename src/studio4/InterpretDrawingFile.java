package studio4;

import java.awt.Color;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		StdDraw.setPenRadius(0.01);
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		
		
		boolean fill = in.nextBoolean();
		
		if(shape.equals("ellipse")) {
			Color ellipse = new Color(red,green,blue);
			StdDraw.setPenColor(ellipse);
			double p1 = in.nextDouble();
			double p2 = in.nextDouble();
			double p3 = in.nextDouble();
			double p4 = in.nextDouble();
				if(fill == true) {
					StdDraw.filledEllipse(p1,p2,p3,p4);
			}else {
				StdDraw.ellipse(p1,p2,p3,p4);
			}
		}else if(shape.equals("rectangle")) {
			Color rectangle = new Color(red,green,blue);
			StdDraw.setPenColor(rectangle);
			double p1 = in.nextDouble();
			double p2 = in.nextDouble();
			double p3 = in.nextDouble();
			double p4 = in.nextDouble();
			if(fill == true) {
				StdDraw.filledRectangle(p1,p2,p3,p4);
		}else {
			StdDraw.rectangle(p1,p2,p3,p4);
		}
		}
		
		
		
	}
}
