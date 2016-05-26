
public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubstract());
		System.out.println(context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println(context.executeStrategy(10, 5));
		
		
	}

}

// In Strategy pattern, a class behavior or its algorithm can be changed at run
// time. 