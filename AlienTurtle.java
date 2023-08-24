import java.util.Random;

public class AlienTurtle extends SmartTurtle {

	public AlienTurtle() {
		super();
	}

	public void draw(int sides, double size) {
		Random random = new Random();
		int probability = random.nextInt(100) + 1;
		System.out.println(probability);
		if (probability <= 70)
			super.draw(8, size);
		else
			super.draw(sides, 10 * sides);
	}

}
