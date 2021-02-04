import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
//Why Predefined Functional Interfaces were required?
//To facilitate the calling of lambda expressions. As lambda expressions can only be called with the help of Functional Interfaces

//PRE-DEFINED FUNCTIONAL INTERFACES TO AVOID OVERHEAD OF AUTO-BOXING and UNBOXING from class to primitive type
/**
 * THESE FUNCTIONAL INTERFACES AUTOMATICALLY TAKES PRIMITIVE TYPES AS INPUT AND DOES NOT REQUIRE UNBOXING
 * 
 * 
 * DoubleFunction : can take type as double and returns any type of value back
 * IntFunction    : can take type as int and returns any type of value back
 * LongFunction   : can take type as long and returns any type of value back
 * DoubleToIntFunction  :   input type - double , return type - int
 * DoubleToLongFunction :   input type - double , return type - long
 * 
 * ....
 * ....
 * 
 * UnaryOperator<T>   
 * CHILD OF FUNCTION<T,T>      
 * CHILD OF FUNCTION FUNCTIONAL INTERFACES USED IN CASE THE INPUT AND OUTPUT TYPES ARE SAME
 * IntUnaryOperator
 * DoubleUnaryOperator
 * LongUnaryOperator
 * 
 * BINARYOPERATOR<T>
 * ACCEPTS 2 PARAMETERS and RETURNS 1 VALUE, ALL THE THREE SHOULD HAVE SAME TYPE, 2 INPUTs and 1 OUTPUT
 * CHILD OF BIFUNCTION<T,T,T>
 * IntBinaryOperator
 * LongBinaryOpertor
 * FloatBinaryOperator
 */



public class PredefinedPrimitiveFunctionalInterfaces {
    
    public static void main(String[] args){

        IntPredicate p1 = i->i%2==0;
        System.out.println(p1.test(5));

    }
}
