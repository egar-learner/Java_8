import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
//Why Predefined Functional Interfaces were required?
//To facilitate the calling of lambda expressions. As lambda expressions can only be called with the help of Functional Interfaces

//FUNCTION
/**
 * USED FOR NON BOOLEAN RETURNING OPERATIONS 
 * 
 * Sample example how a predicate interface would look like
 * interface Function<T,R>{
 * 
 *  public R apply(T t);
 * 
 * }
 * 
 * CHAINING OF FUNCTION IS POSSIBLE
 * 
 * First function is executed and then the result of the first function is passed as a input to the second function
 * And finally the result is returned
 * f1.andThen(f2).apply(input)
 * f1.compose(f2).apply(input)          In this case first f2 is executed and then f1 is executed
 *
 * 
 */

 class EmployeeClassPredicate {
     String name;
     long salary;
     EmployeeClassPredicate(String name, long salary){
         this.name = name;
         this.salary = salary;
     }
 }


public class PredefinedFunctionalInterfacesFunction {
    
    public static void main(String[] args){
        Function<Integer, Boolean> p1 = i -> i%2 == 0;

        System.out.println(p1.apply(10));
        System.out.println(p1.apply(21));

        Function<Integer,Integer> p4 = i -> i*i;

        System.out.println(p4.apply(4));

        Function<String,Integer> p2 = s -> s.toUpperCase().length();

        System.out.println(p2.apply("Manish"));
        System.out.println(p2.apply("Kumar"));

        List<EmployeeClassPredicate> li = new ArrayList<>();
        li.add(new EmployeeClassPredicate("Manish9", 9999L));
        li.add(new EmployeeClassPredicate("Manish1", 1111));
        li.add(new EmployeeClassPredicate("Manish4", 4444L));
        li.add(new EmployeeClassPredicate("Manish5", 5555L));
        li.add(new EmployeeClassPredicate("Manish3", 3333L));

        Function<EmployeeClassPredicate,String> p3 = e->{
            if(e.salary>5000)
                return "High Paid";
            else if(e.salary>3000 && e.salary<5000)
                return "Average Paid";
            else
                return "Below Average Paid";
        };

        Predicate<EmployeeClassPredicate> p5 = e -> e.salary>3000;
        for( EmployeeClassPredicate e: li){
            if(p5.test(e))
                System.out.println(p3.apply(e));

        }


        Function<Integer,Integer> f6 = i->i*2;
        Function<Integer,Integer> f7 = i->i*i*i;

        System.out.println(f6.andThen(f7).apply(2));        //64
        System.out.println(f7.andThen(f6).apply(2));        //16
        System.out.println(f6.compose(f7).apply(2));        //16
        System.out.println(f7.compose(f6).apply(2));        //64

        //This can have a chain of any number of functions 
        System.out.println(f6.andThen(f7).andThen(f6).apply(2));        //128
    }
}
