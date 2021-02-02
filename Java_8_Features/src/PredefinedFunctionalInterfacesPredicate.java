import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
//Why Predefined Functional Interfaces were required?
//To facilitate the calling of lambda expressions. As lambda expressions can only be called with the help of Functional Interfaces

//All the predefined functional interfaces are required in  JAVA.UTIL.FUNCTION
//1.    Predicate
//2.    Function
//3.    Consumer
//4.    Supplier

//Two argument predefined functional interfaces:
// 1.   BiPredicate
// 2.   BiFunction
// 3.   BiConsumer

//Primitive Funcational Interface:
//1.    IntPredicate
//2.    IntFunction
//3.    IntConsumer
//4.    FloatPredicate
//........


//PREDICATE
/**
 * USED FOR CONDITIONAL CHECKS
 * 
 * Sample example how a predicate interface would look like
 * interface Predicate<T>{
 * 
 *  public boolean test(T t);
 * 
 * }
 * 
 * ALSO WE CAN COMBINE MORE THAN ONE PREDICATE CONDITIONS USING 'and' 'or'
 * ALSO WE CAN USE 'negate' to like a 'not' operator to reverse the result
 */

 class EmployeeClassPredicate {
     String name;
     long salary;
     EmployeeClassPredicate(String name, long salary){
         this.name = name;
         this.salary = salary;
     }
 }


public class PredefinedFunctionalInterfacesPredicate {
    
    public static void main(String[] args){
        Predicate<Integer> p1 = i -> i%2 == 0;

        System.out.println(p1.test(10));
        System.out.println(p1.test(21));

        Predicate<String> p2 = s -> s.length() > 5;

        System.out.println(p2.test("Manish"));
        System.out.println(p2.test("Kumar"));

        List<EmployeeClassPredicate> li = new ArrayList<>();
        li.add(new EmployeeClassPredicate("Manish9", 9999L));
        li.add(new EmployeeClassPredicate("Manish1", 1111));
        li.add(new EmployeeClassPredicate("Manish4", 4444L));
        li.add(new EmployeeClassPredicate("Manish5", 5555L));
        li.add(new EmployeeClassPredicate("Manish3", 3333L));

        Predicate<EmployeeClassPredicate> p3 = e->e.salary>3000;

        for( EmployeeClassPredicate e: li){
            if(p3.test(e)){
                System.out.println(e.name);
            }

            System.out.println("After Negating the condidtion in the predicate");
            //negate returns the opposite of the expression written in the predicate
            if(p3.negate().test(e)){
                System.out.println(e.name);
            }

            //Combining with 'or' to print all the results
            System.out.println("All results one by one");
            //This says      'p1.or(p2).test(input)'
            if(p3.or(p3.negate()).test(e)){
                System.out.println(e.name);
            }

            //Nothing will be printed 'p1.and(p2).test(input)'
            System.out.println("Nothing will be printed in this case as one the conditions will always be false");
            if(p3.and(p3.negate()).test(e)){
                System.out.println(e.name);
            }
            System.out.println("Is anything printed?");

        }
    }
}
