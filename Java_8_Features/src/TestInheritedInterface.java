
@FunctionalInterface
public interface TestInheritedInterface extends TestInterface {
	//This is also a valid functional interface as it is extending TestInterface which is a 
	//valid functional interface and hence, it is having all its properties available here as well
	
	
	//Even if we specify the same abstract method again it is valid
	//as we are overriding the previously 
	public void m1();

}
