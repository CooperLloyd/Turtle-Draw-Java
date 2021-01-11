package ca.queensu.cs.cisc124.asgmt.a2;

import java.awt.*;


import ca.queensu.cs.cisc124.notes.basics.geometry.Point2;
import ca.queensu.cs.cisc124.notes.basics.geometry.Vector2;
import princeton.introcs.StdDraw;

public class MyDrawing {
	/**
	 * draws a triangular spiral offset by 1 degree
	 * @param color the color for the spiral
	 * @param location the starting location for the spiral
	 */
	public static void triangleSpiral(Color color, Point2 location){
		Turtle turtle = new Turtle(location,0,color);
		for(int i=0; i<500; i++) {
			turtle.forward(i *3);
			turtle.turnRight(121);
		}
	}



	public static void main(String[] args) {
		StdDraw.setScale(-500, 500);
		triangleSpiral(Color.MAGENTA, new Point2(0.0,0.0));
	}

}
