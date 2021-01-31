
public class LambdaExpressions implements TestInterface {

	public static void main(String[] args) {
		
		//Parent reference can be used to hold child object
		TestInterface testInt = new LambdaExpressions();
		testInt.m1();
		
		//NO SEPERATE .CLASS FILE WILL BE GENERATED FOR LAMBDA EXPRESSIONS, 
		//THEY WOULD BE PART OF THE MAIN FILE .CLASS ITSELF
		TestInterface testLambda = () -> System.out.println("Hello from the implementation of "
				+ "abstract method from lambda implementation");
		
		TestInterface testLambda2 = () -> System.out.println("Hello World from Lambda Expression");
		
		
		TestInterface2 testLambda3 = (a,b) -> {
			System.out.println("adding 2 numbers from normal Java method");
			System.out.println(a+b);
			return a+b;
		};
		
		
		TestInterface3 testLambda4 = n -> {return n*n;};
		
		
		TestInterface4 testLambda5 = s -> {return s.length();};
		
		
		//n-> return n*n;			==>	invalid
		//n-> {return n*n;};		==>	valid
		//n-> {return n*n};			==>	invalid(; missing)
		//n-> {n*n;};				==>	invalid
		//n->n*n;					==>	valid
		
		//RULE 1: Without curly braces we cannot use "return" keyword. 
		//		  Compiler will consider return automatically
		//RULE 2: Within curly braces if we want to return some compulsurily we should user return statement.
		
		
		
		
		//For calling lambda experssion
		//Functional Interface
		//An interface which contain single Abstract method is known as Functional Interface.
		//There is no restriction on how many default or static methods should be there in 
		//the Functional Interface.
		//eg. 	Runnable		==> run()
		//		Comparable		==> compareTo()
		//		Comparator		==> compare()
		//		ActionListener	==> actionPerformed()
		//		Callable		==> call()
		
		
		

	}
	
	public void helloWorld() {
		System.out.println("Hello World from normal method");
	}
	
	public void addTwoNumbers(int a,int b) {
		System.out.println("adding 2 numbers from normal Java method");
		System.out.println(a+b);
	}
	
	public int squareNumber(int n) {
		return n*n;
	}
	
	public int getLength(String s) {
		return s.length();
	}

	@Override
	public void m1() {
		System.out.println("Hello from the implementation of abstract method");
		
	}
	
}
