package defaultMethod;

/**
 * Created by f.taleb on 6/20/2017.
 */

/*If a class implementing more than one interface, inherits default methods with identical method signatures from each of the intefaces,
 then it must override and provide its own interface as if they were not default methods (as part of resolving multiple inheritance).*/

public class PrintableImpl4 implements Printable3{
    @Override
    public String hello() {
        return "Take it Easy! Hello and Hi is same to each other !" ;
    }
}
