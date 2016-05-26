
public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}

}

// Bridge pattern via following example in which a circle can be drawn in
// different colors using same abstract class method but different bridge
// implementer classes.