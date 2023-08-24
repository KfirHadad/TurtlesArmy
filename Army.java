import Turtle.*;

import java.util.Scanner;

public class Army {

	static Turtle[] army = new Turtle[5];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Assemble your army turtles:");
		assembleArmy();
		alignArmy();
		armyMarch();
		drawShape();
		disapear();
	}

	public static void assembleArmy() {

		for (int i = 0; i < army.length; i++) {
			System.out.println("Choose the type of a turtle:");
			System.out.println("\n1.	Simple\n2.	Smart\n3.	Drunk\n4.	Astronaut\n5.	Alien\n6.	Space");
			int opt = scn.nextInt();

			switch (opt) {
			case 1:
				Turtle simple = new Turtle();
				army[i] = simple;
				break;
			case 2:
				SmartTurtle smart = new SmartTurtle();
				army[i] = smart;
				break;
			case 3:
				DrunkTurtle drunk = new DrunkTurtle();
				army[i] = drunk;
				break;
			case 4:
				AstronautTurtle astro = new AstronautTurtle();
				army[i] = astro;
				break;
			case 5:
				AlienTurtle alien = new AlienTurtle();
				army[i] = alien;
				break;
			case 6:
				SpaceTurtle space = new SpaceTurtle();
				army[i] = space;
				break;
			default:
				System.out.println("No such turtle, choose again");
				break;
			}
		}
	}

	public static void alignArmy() {

		for (int i = 0; i < army.length; i++) {
			army[i].tailUp();
			if (army[i] instanceof DrunkTurtle) {
				((DrunkTurtle) army[i]).turnLeftNormal(90);
				((DrunkTurtle) army[i]).moveForwardNormal(200);
				((DrunkTurtle) army[i]).turnLeftNormal(180);
				((DrunkTurtle) army[i]).moveForwardNormal(120 * i);
				((DrunkTurtle) army[i]).turnLeftNormal(90);
			} else {
				army[i].turnLeft(90);
				army[i].moveForward(200);
				army[i].turnLeft(180);
				army[i].moveForward(120 * i);
				army[i].turnLeft(90);
			}

		}
	}

	public static void armyMarch() {
		for (int i = 0; i < army.length; i++) {
			army[i].tailDown();
			army[i].moveForward(65);
			army[i].turnLeft(40);
			army[i].moveForward(75);
		}
	}

	public static void drawShape() {
		for (int i = 0; i < army.length; i++) {

			if (army[i] instanceof SmartTurtle) 
				((SmartTurtle) army[i]).draw(6, 40);;
			
		}
	}

	public static void disapear() {
		for (int i = 0; i < army.length; i++) {
			army[i].hide();
		}
	}
}
