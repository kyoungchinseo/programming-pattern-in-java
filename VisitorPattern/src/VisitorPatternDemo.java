
public class VisitorPatternDemo {

	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}

// In Visitor pattern, we use a visitor class which changes the executing
// algorithm of an element class. By this way, execution algorithm of element
// can vary as and when visitor varies.

