interface InterfacesCanContainMainMethodAlso {

    
    //What is the advantage this declaration of static methods inside interface??

    //We can declare the utility methods(add,sub,multiply,divide) inside interface as these methods are independent methods 
    //Not related to any class / object and can be directly accessed in the program with the Interface
    //name reference directly
    public static void main(String[] args){
        System.out.println("This is main method calling from inside interface from Java 8 onwards");
    }
}
