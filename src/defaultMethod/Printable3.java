package defaultMethod;

/**
 * Created by f.taleb on 6/20/2017.
 */

/*Default method Can be overridden by subclasses or by a sub-interface*/
public interface Printable3 extends Printable , Printable2 {

    @Override
    String hello() ;

}
