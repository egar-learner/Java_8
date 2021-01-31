
@FunctionalInterface
public interface TestInterface3 {
	
	//A functional interface must contain only 1 abstract method
	//It can have any number of default and static methods

	//An abstract method
	public int m1(int a);
	
	//A default method
	default void m2() {
		
	}
	
	//A Static method
	public static void m3() {
		
	}
}
