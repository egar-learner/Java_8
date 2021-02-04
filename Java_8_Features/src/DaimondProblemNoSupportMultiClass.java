class A{
    public void m1(){
        System.out.println("Hi from Class A");
    }
}

class B{
    public void m1(){
        System.out.println("Hi from Class B");
    }
}

//public class DaimondProblemNoSupportMultiClass extends A,B {
public class DaimondProblemNoSupportMultiClass extends A {

    DaimondProblemNoSupportMultiClass sample = new DaimondProblemNoSupportMultiClass();
    
    
}


interface Left {
    default void meth(){
        System.out.println("This is left side method");
    }
}

interface Right {
    default void meth(){
        System.out.println("This is right side method");
    }
}

//Gives the problem 
//Duplicate default methods named meth with the parameters () and () are inherited from the types Right and Left
class ImplInterface implements Left,Right {

    //But the error Duplicate default method is gone if we give its implementation on our own
    public void meth(){
        //System.out.println("This is our own meth");
        //Left.super.meth();
        Right.super.meth();
    }

    public static void main(String[] args){
        ImplInterface test = new ImplInterface();
        test.meth();
    }
}
