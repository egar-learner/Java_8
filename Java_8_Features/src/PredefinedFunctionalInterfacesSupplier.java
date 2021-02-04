import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
//Why Predefined Functional Interfaces were required?
//To facilitate the calling of lambda expressions. As lambda expressions can only be called with the help of Functional Interfaces

//SUPPLIER
/**
 * IT JUST RETURNS US THE REQUIRED VALUE AND DOES NOT TAKE ANY VALUE AS A INPUT
 * 
 * Sample example how a consumer interface would look like
 * interface Supplier<R>{
 * 
 *  public R get();
 * 
 * }
 * 
 *
 * 
 */

 class EmployeeClassSupplier {
     String name;
     long salary;
     EmployeeClassSupplier(String name, long salary){
         this.name = name;
         this.salary = salary;
     }
 }


public class PredefinedFunctionalInterfacesSupplier {
    
    public static void main(String[] args){
        Supplier<Date> s1 = () -> new Date();
        System.out.println(s1.get());

        //Generate a 6 digit random otp
        Supplier<String> s2 = () -> {
            String otp = "";
            for (int i=0;i<6;i++){
                otp += (int)(Math.random()*10);
            }
            return otp;
        };

        System.out.println(s2.get());



        //2 Argument functional interfaces

        BiPredicate<Integer,Integer> p1 = (num1,num2)-> (num1+num2)%2==0;
        System.out.println(p1.test(5, 5));

        BiFunction<Integer,Integer,Integer> f1 = (num1,num2) -> num1+num2;
        System.out.println(f1.apply(5, 5));

        BiConsumer<Integer,Integer> c1 = (num1,num2) -> System.out.println(num1+num2);
        c1.accept(10, 10);

    }
}
