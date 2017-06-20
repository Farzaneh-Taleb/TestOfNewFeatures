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


    }
}

