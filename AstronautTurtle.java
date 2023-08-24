import Turtle.*;

public class AstronautTurtle extends Turtle {
	private static boolean willJump = true;

	public AstronautTurtle() {
		super();
	}

	public void tailDown() {
		willJump = true;
		super.tailDown();
	}

	public void tailUp() {
		willJump = false;
		super.tailUp();
	}

	public void moveForward(double distance) {
		if (willJump) {
			double remainingDistance = distance;
			while (remainingDistance > 0) {
				super.moveForward(5); 
				tailUp();
				super.moveForward(5); 
				tailDown();
				remainingDistance -= 10; 
			}
		} else {
			super.moveForward(distance);
		}
	}
}
