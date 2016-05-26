
public class CustomerFactory {
	public static final String[] names = { "Rob", "Joe", "Julie" };

	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}

		return new NullCustomer();
	}

}

// In Null Object pattern, a null object replaces check of NULL object instance.
// Instead of putting if check for a null value, Null Object reflects a do
// nothing relationship. Such Null object can also be used to provide default
// behaviour in case data is not available.


