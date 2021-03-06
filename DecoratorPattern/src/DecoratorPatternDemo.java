
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();

	}

}

// This pattern creates a decorator class which wraps the original class and
// provides additional functionality keeping class methods signature intact.

// We're going to create a Shape interface and concrete classes implementing the
// Shape interface. We will then create an abstract decorator class
// ShapeDecorator implementing the Shape interface and having Shape object as
// its instance variable.

