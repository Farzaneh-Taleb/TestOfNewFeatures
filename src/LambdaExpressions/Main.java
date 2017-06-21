package LambdaExpressions;


import java.util.function.*;

/**
 * Created by f.taleb on 6/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        Object obj = (FunctionalInt1) () -> System.out.println("Hello");
        System.out.println(obj instanceof FunctionalInt1);


        SingleParameterFunctional isFemale = (x) -> {
            return x ? 1 : 0;
        };
        System.out.println(isFemale.isFemale(true));


/*Implicit Returns
If the code placed inside a lambda is a Java expression rather than a statement,
it is treated as a method which returns the value of the expression. Thus, the following two are equivalent:
*/
        IntUnaryOperator addOneShort = (x) ->x+1 ;
        IntUnaryOperator addOneLong = (x) -> {return x+1 ; } ;


        /*A lambda closure is created when a lambda expression references the variables of an enclosing scope (global or local). The rules for doing this are the same as those for inline methods and anonymous classes.
                Local variables from an enclosing scope that are used within a lambda have to be final. With Java 8 (the earliest version that supports lambdas),
        they don't need to be declared final in the outside context, but must be treated that way.*/

      /*  int n = 5 ;
        Runnable r = () -> {
            int i = n ;
        } ;
n++ ;*/
        /*This is legal as long as the value of the n variable is not changed. If you try to change the variable, inside or outside the lambda, you will get the following compilation error:
"local variables referenced from a lambda expression must be final or effectively final".*/




       /* If it is necessary to use a changing variable within a lambda,
        the normal approach is to declare a final copy of the variable and use the copy. For example.
        Naturally, the body of the lambda does not see the changes to the original variable.*/
int j = 6 ;
       final int k =j  ;
        Runnable r2 = () -> {
            int i = k ;
        } ;
 j++ ;


    }
}

