import Turtle.*;

public class DrunkTurtle extends Turtle{
	
	public DrunkTurtle() {
		super();
	}

	public void moveForward(double distance) {
		double move1 = Math.random() * distance;
		double move2 = Math.random() * distance / 2;
		super.moveForward(move1);
		boolean makeTurn = (Math.random() < 0.3 ? true : false);
		if (makeTurn)
			super.turnLeft((int)distance);
		super.moveForward(move2);
	}
	

	public void turnRight(int y) {
		super.turnRight((int) (Math.random() * y * 1.5));
	}
	
	public void turnLeft(int y) {
		super.turnLeft((int) (Math.random() * y * 1.5));
	}

	protected void moveForwardNormal(double distance) {
		super.moveForward(distance);
	}
	
	protected void turnRightNormal(int y) {
		super.turnRight(y);
	}
	
	protected void turnLeftNormal(int y) {
		super.turnLeft(y);
	}
}
