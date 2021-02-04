import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
//Why Predefined Functional Interfaces were required?
//To facilitate the calling of lambda expressions. As lambda expressions can only be called with the help of Functional Interfaces

//CONSUMER
/**
 * IT JUST CONSUMES THE INPUT AND DO SOME OPERATION, RETURNS NOTHING
 * 
 * Sample example how a consumer interface would look like
 * interface Consumer<T>{
 * 
 *  public void accept(T t);
 * 
 * }
 * 
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


public class PredefinedFunctionalInterfacesConsumer {
    
    public static void main(String[] args){

        Consumer<String> p2 = s -> System.out.println(s.toUpperCase());

        p2.accept("Manish");
        p2.accept("Kumar");

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
                p2.accept(p3.apply(e));

        }


        Function<Integer,Integer> f6 = i->i*2;
        Function<Integer,Integer> f7 = i->i*i*i;

        System.out.println(f6.andThen(f7).apply(2));        //64
        System.out.println(f7.andThen(f6).apply(2));        //16
        System.out.println(f6.compose(f7).apply(2));        //16
        System.out.println(f7.compose(f6).apply(2));        //64

        //This can have a chain of any number of functions 
        System.out.println(f6.andThen(f7).andThen(f6).apply(2));        //128

        Consumer<String> c1 = s->System.out.println(s + " c1 is here!!");
        Consumer<String> c2 = s->System.out.println(s + " c2 is here!!");
        Consumer<String> c3 = s->System.out.println(s + " c3 is here!!");
        Consumer<String> c4 = c1.andThen(c2).andThen(c3).andThen(s->System.out.println(s+"c4 is also here !!"));

        c4.accept("Manish using chainging of consumers");

    }
}
