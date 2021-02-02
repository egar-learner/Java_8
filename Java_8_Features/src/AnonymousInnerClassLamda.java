//Class which is not having any name is called Anonymous Class


//Following is the example of creation of Object of Child class that is a Anonymous Inner Class which is extending
//Thread Class

//Thread t = new Thread()
//{
//  ...Body of Anonymous Inner class which is extending Parent class(Thread)
//  ... This class may contain more than one abstract method as it does not have a restriction like lamda expressions
//  ... But if we want to use lamda expression instead of anonymous inner class,
//  ... Compulsorily the should only have one abstract method . ONLY THEN IT CAN BE CONVERTED TO LAMDA EXPRESSION
//}

//1. AnonymousInner Class can extend a normal class
//2. AnonymousInner Class can extend an abstract class
//3. AnonymousInner Class can implement an interface which contains any number of abstract methods

//Basically AnonymousInner Class have more power than the regular Lambda Expression as Lambda expressions can only extend FI

class AnonymousInnerCLassLamda {
                                            
    public static void main(String[] args) {
        
        //"t" is not the object of Runnable class this is the object of the child class
        //which is extending Runnable class
        Runnable r = new Runnable(){
            public void run(){
                for(int i = 0;i<10;i++){
                    System.out.println("Child Thread");
                }
            }
        };

        Runnable r1 = ()->{for(int i = 0;i<10;i++){
            System.out.println("Child Thread From Lamda");
        }};

        Thread t = new Thread(r);
        t.start();

        Thread t1 = new Thread(r1);
        t1.start();


        for(int i =0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}