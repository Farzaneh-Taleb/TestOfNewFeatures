package defaultMethod;

/**
 * Created by f.taleb on 6/19/2017.
 */
public interface Printable {

    /*Default method Can be used within an interface, to introduce a behaviour without forcing existing subclasses to implement it.*/
    default void printString()
    {
        System.out.println("Print Default method");
    }

    default String hello() {
        return "hello" ;
    }
}
