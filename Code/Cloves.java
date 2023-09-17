package Cloves;
import robocode.*;
import java.awt.Color;
/**
 * cloves - a class by (Danilo Guedes)
 */
public class Cloves extends Robot {
	public void run() {
		setColors(Color.magenta,Color.white,Color.orange,Color.red,Color.magenta);
		while (true) {
			turnGunRight (360);
			ahead (100);
			turnRight(90);
		}
	 }
	 //detectar robô inimigo
	 public void onScannedRobot (ScannedRobotEvent e) {
		 fire (3);
		 String robotank = e.getName ();
		 double distancia = e.getDistance();
		 System.out.println(robotank + "distância" + distancia);
		 
	 }
	 //colidir na parede
	 public void onHitWall (HitWallEvent e) {
		 back (50);
		 turnRight (90);
	 }
}
