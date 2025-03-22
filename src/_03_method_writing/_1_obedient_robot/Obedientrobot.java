package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Obedientrobot {
	public static void drawSquare(Robot rob, int size) {
		for(int i = 0; i < 4; i++) {
			rob.move(size);
			rob.turn(90);
		} 
	}
		public static void drawTriangle(Robot rob, int size) {
			for(int i = 0; i < 3; i++) {
				rob.move(size);
				rob.turn(120);
			}
			
			
	}
		public static void drawCircle(Robot rob, int size) {
			for(int i = 0; i < 36; i++) {
			rob.move(size);
			rob.turn(10);
			
			}
		}
	public static void main(String[] args) {
		
		Robot rob = new Robot(); 
		rob.penDown();
		rob.setSpeed(30);
		
		
		
		for(int i = 200; i > 0; i-=10) {
			drawTriangle(rob, i);
		drawSquare(rob, i);
		drawCircle(rob, i / 5);
		}
		rob.hide();
	}
}
