/*
 * 
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
	
	public void run() {
		int cx = getWidth() / 2;
		int cy = getHeight() / 2;
		drawHead(cx, cy);
		drawEye(cx + HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4);
		drawEye(cx - HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4);
		drawMouth(cx, cy + HEAD_HEIGHT / 4);
	}
	public void drawHead(double cx, double cy) {
		double x = cx - HEAD_WIDTH / 2;
		double y = cy - HEAD_HEIGHT / 2;
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
	}
	public void drawEye(double cx, double cy) {
		double x = cx - EYE_RADIUS;
		double y = cy - EYE_RADIUS;
		GOval eye = new GOval(x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFilled(true);
		eye.setFillColor(Color.YELLOW);
		add(eye);
	}
	public void drawMouth(double cx, double cy) {
		double x = cx - MOUTH_WIDTH / 2;
		double y = cy - MOUTH_HEIGHT / 2;
		GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		add(mouth);
	}
}