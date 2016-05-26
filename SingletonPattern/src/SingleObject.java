
public class SingleObject {

	private static SingleObject instance = new SingleObject();

	// make the constructor private so that this class cannot be instantiated
	private SingleObject() {
	}

	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}

// This pattern involves a single class which is responsible to create an object
// while making sure that only single object gets created. This class provides a
// way to access its only object which can be accessed directly without need to
// instantiate the object of the class.

