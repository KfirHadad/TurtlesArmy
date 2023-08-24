import Turtle.*;

public class SmartTurtle extends Turtle {

	public SmartTurtle() {
		super();
	}

	public void draw(int sides, double size) {
		if (sides < 3)
			return;
		double angle = ((sides - 2) * 180) / (double)sides;
		if (Math.abs(angle - (int) angle) == 0) {
			for (int i = 0; i < sides; i++) {
				moveForward(size);
				turnRight(180 - (int) angle);
			}
		}
	}

}
