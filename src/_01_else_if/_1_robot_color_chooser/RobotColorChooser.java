
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		for(int i = 2; i > 1;) {
		rob.penDown();
		rob.setSpeed(255);
		
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog(null, "Which color should Rob the robot draw a triange with? Your choices are red, blue, yellow, green, white, black, and if you put nothing Rob will color it cyan (all lowercase)");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equals("red")) {
			rob.setPenColor(Color.RED);
		}
		if(color.equals("blue")) {
			rob.setPenColor(Color.BLUE);
		}
		if(color.equals("yellow")) {
			rob.setPenColor(Color.YELLOW);
		}
		if(color.equals("green")) {
			rob.setPenColor(Color.GREEN);
		}
		if(color.equals("white")) {
			rob.setPenColor(Color.WHITE);
		}
		if(color.equals("black")) {
			rob.setPenColor(Color.BLACK);
		}
	    //2. Make the robot draw a shape (this will take more than one line of code)	
			rob.penDown();
			rob.setSpeed(255);
			rob.move(275);
			rob.turn(120);
			rob.move(275);
			rob.turn(120);
			rob.move(275);
			rob.turn(120);
			//3. Set the pen width to 10
			rob.setPenWidth(10);
		
        //6. If the user doesn't enter anything, choose a random color
			if(color.equals(" ")) {
				rob.setPenColor(Color.CYAN);
			}
			}
	}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		


	}
	

