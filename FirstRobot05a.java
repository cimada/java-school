package cji;
import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * FirstRobot - a robot by Clinten Imada
 */
public class FirstRobot05a extends Robot
{
	/**
	 * run: FirstRobot's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.black,Color.red,Color.yellow); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunLeft(360);

		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */

	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(10);
		turnGunLeft(5);
		fire(1);
		turnGunRight(5);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnLeft(90);
		back(200);
	}

	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(135);
		ahead(200);
	}
}
