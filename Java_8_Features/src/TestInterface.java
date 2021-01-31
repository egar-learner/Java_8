
@FunctionalInterface
public interface TestInterface {
	
	//A functional interface must contain only 1 abstract method
	//It can have any number of default and static methods

	//An abstract method
	public void m1();
	
	//A default method
	default void m2() {
		
	}
	
	//A Static method
	public static void m3() {
		
	}
}
