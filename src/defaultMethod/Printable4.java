package defaultMethod;

/**
 * Created by f.taleb on 6/20/2017.
 */


public interface Printable4 extends Printable2 , Printable {
    @Override
    default String hello() {
        return "hello hello hi hi" ;
    }
}
