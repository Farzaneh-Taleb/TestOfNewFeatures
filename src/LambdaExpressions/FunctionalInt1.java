package LambdaExpressions;

/**
 * Created by f.taleb on 6/20/2017.
 */

/*Functional interface(Single Abstract Method Interfaces, or SAM Interface),  is an interface with just one abstract method.
 Functional interfaces can have any number of default or static methods.
  */


/*@FunctionalInt1 annotation can be added.This has no special effect, but a compiler error will be generated if
        this annotation is applied to an interface which is not functional, thus acting as a reminder that the interface should not be changed.
*/

/*You cannot specify the name of the method when using a lambda—but you shouldn't need to,
 because a functional interface must have only one abstract method, so Java overrides that one*/

@FunctionalInterface
public interface FunctionalInt1 {
    void helloFunctional();

}
