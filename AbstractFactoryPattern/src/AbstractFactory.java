
public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shapeType);
}

// interface vs. abstract class
// http://www.hoons.net/Board/asptip/Content/23472

// Abstract Factory patterns work around a super-factory which creates other
// factories. This factory is also called as factory of factories.