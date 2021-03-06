/*
 * RobotHead.java
 * By: Jameson Squyres
 * 
 * This program will draw a head, 2 eyes, and a mouth to make the face of a robot in the center of the screen.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RobotHead extends GraphicsProgram {

	private static final int HEAD_WIDTH = 100;	
	private static final int HEAD_HEIGHT = 150;
	private static final int EYE_RADIUS = 10;
	private static final int MOUTH_WIDTH = 60;
	private static final int MOUTH_HEIGHT = 20;
	// Get the width and height of the screen, divide in half to get the center, then use the center of x and y to draw head, eyes, and mouth.
	public void run() {
		int cx = getWidth() / 2;
		int cy = getHeight() / 2;
		drawHead(cx, cy);
		drawEye(cx + HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4);
		drawEye(cx - HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4);
		drawMouth(cx, cy + HEAD_HEIGHT / 4);
	}	// Draw the head of the robot, center x and y by subtracting half of width and height
	public void drawHead(double cx, double cy) {
		double x = cx - HEAD_WIDTH / 2;
		double y = cy - HEAD_HEIGHT / 2;
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
	}	// Draw an eye of the robot, center by subtracting radius, multiply radius by 2 to get the diameter
	public void drawEye(double cx, double cy) {
		double x = cx - EYE_RADIUS;
		double y = cy - EYE_RADIUS;
		GOval eye = new GOval(x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFilled(true);
		eye.setFillColor(Color.YELLOW);
		add(eye);
	}	// Draw the mouth of the robot in the same way as the drawHead method
	public void drawMouth(double cx, double cy) {
		double x = cx - MOUTH_WIDTH / 2;
		double y = cy - MOUTH_HEIGHT / 2;
		GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		add(mouth);
	}
}