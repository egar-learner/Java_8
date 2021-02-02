//Since the static methods are not dependent on the class 
// We should declare these methods in interface rather declaring them in class which is considered to be a heavy weight
//object than the interface


interface Interf{
    public static void method(){
        System.out.println("This is a static method inside interface");
    }
}

//Even without implementation the static methods of interface are available in the program after they take place in memory
//public class StaticMethodsInInterface implements Interf {
public class StaticMethodsInInterface {
    
    public static void main(String[] args){
        //Static methods of interface are only accessible with the Interface name reference and 
        //are not directly available in the class implementing the interface
        Interf.method();


        //All the below are invalid ways to access the interface method
        //StaticMethodsInInterface.method();
        //StaticMethodsInInterface tes = new StaticMethodsInInterface();
        //tes.method();
        //method();
    }
}


