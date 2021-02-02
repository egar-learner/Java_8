
//Every variable inside interface is public static final by default

interface DefaultMethodsInterface {

    //Default | Virtual Extension | Defender  methods

    //NOTE: Object Class methods cannot be decalred and given a definition as default methods
    //eg. 
    //A default method cannot override a method from java.lang.Object
    //default int hashCode(){
    //    System.out.println("hello hashcode");
    //    return 10;
    //}

    //JAVA DOESN'T PROVIDE SUPPORT FOR MULTIPLE INHERITANCE
    //eg.           class A                 class B
    //
    //
    public void m1();
    public void m2();
    default void m3(){
        System.out.println("Default Method is not required to be provided an implementation mandatorily"+
        "If the Class implementing the Interface can give or can use this implementation or can just ignore it");
    }
    
}

class Test1 implements DefaultMethodsInterface{
    public void m1(){}
    public void m2(){}
}
class Test2 implements DefaultMethodsInterface{
    public void m1(){}
    public void m2(){}
}
class Test3 implements DefaultMethodsInterface{
    public void m1(){}
    public void m2(){}
}
class Test100 implements DefaultMethodsInterface{
    public void m1(){}
    public void m2(){}
}

class Main {
    public static void main(String[] args){
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        Test3 t3 = new Test3();
        Test100 t100 = new Test100();
    }
}
